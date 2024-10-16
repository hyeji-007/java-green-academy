package com.green.practice.day07.ch10;

public class StaticStudy {

    public static void main(String[] args) {
        NonstaticNumBox nnb1 = new NonstaticNumBox();
        nnb1.n1 = 10;
        nnb1.n2 = 30;

        NonstaticNumBox nnb2 = new NonstaticNumBox();
        nnb2.n1 = 15;
        nnb2.n2 = 20;

        nnb1.sum();
        nnb2.sum();

        System.out.println("---------------------------");

        StaticNumBox snb1 = new StaticNumBox(); //static: 같은 공간에 저장된 수를 참조함
        snb1.n1 = 10;  //snb1, snb2는 같은 공간임
        snb1.n2 = 30;

        StaticNumBox snb2 = new StaticNumBox(); //static: 같은 공간에 저장된 수를 참조함
        snb2.n1 = 15;  //snb1, snb2는 같은 공간임
        snb2.n2 = 30;

        snb1.sum();
        snb2.sum(); //static은 같은 공간을 공유하기 때문에 마지막 수정된 값을 적용

        /*
        객체마다 멤버필드의 공간이 각각 생기길 원하면 non-static(인스턴스 멤버필드)로 해야한다.
        (각 객체마다 다른 값을 저장 가능하게 하고 싶다면)

        static을 사용할 수 있으면 (위 두줄의 사용과 반대되는 경우) 적극 사용하는 것을 추천!
        왜냐하면 일단 실행 속도가 빠르고 사용하기 편하다(객체 생성이 필요하지 않기 때문)
         */

        StaticNumBox.n1 = 50;
        StaticNumBox.n2 = 60;
        StaticNumBox.sum(); //110
        StaticNumBox.sum(150, 160); //310
        //클래스 멤버필드, 메소드는 위 처럼 사용할 수 있다.
        //매개변수만 이용하여 해결하는 메소드는 static mathod로 만들면 좋다.
        //즉, 멤버필드 사용하지 않는 경우

        Math.random(); //Math 클래스 안에 있는 random 이름의 static method
        //Math math = new Math(); //기본생성자 앞에 private 붙음 >> 객체 생성 x
        //math.random();
        //이렇게 두 줄을 통해서 메소드를 호출할 필요가 없기 때문에 static메소드 사용이 편함
        //그리고 Math 클래스는 객체화를 할 수 없다. 이유는 기본 생성자 접근 레벨을 private으로 설정했기 때문
    }
}


class StaticNumBox {
    static int n1;
    static int n2;
    int n3;
    int n4;

    static void sum(int n1, int n2) {
        System.out.println(n1 + n2);
    }

    //오버로딩은 파라미터만 다르다면 가능함
    static void sum() {
        System.out.println(n1 + n2);
        //System.out.println(n3 + n4); //static 메소드에서 인스턴스 멤버변수 접근 불가
        //hello(); //static 메소드에서 instance 메소드는 호출이 불가함
        //parameter만 다르면 overloading이 가능함 (호출할 때 구분이 가능하면, 다른 조건은 상관 x)

    }

}


class NonstaticNumBox {
    int n1;
    int n2;
    static int n3;
    static int n4;
    //인스턴스 메소드
    void sum() {
        System.out.println(n1 + n2);
        System.out.println(n3 + n4); //인스턴스 메소드에서 클래식 멤버변수 접근 가능함
        hello(); //인스턴스 메소드에서 클래스 멤버메소드 호출 가능함
        //왜 가능하냐 sum()메소드가 호출이 된다는 것은 NonstaticNumBox가 객체화가 되었다는 것이고 static은 이미 메모리에 올라가 있기 때문에 사용이 가능함
    }

    //hello 메소드
    void hello() {
        System.out.println("hello");
        /*
        1. hello() 메소드는 NonstaticNumBox 클래스의 인스턴스 메소드로 선언되었고
        sum() 메소드 내부에서 호출될 수 있음
        2. 인스턴스 메소드인 sum()은 이미 객체가 생성된 상태에서 호출되므로 hello() 메소드를 호출하는 데 문제가 없음
        3. static 메소드나 필드는 객체와 독립적으로 사용되지만, 인스턴스 메소드는 <객체 생성 후에만> 사용할 수 있음
         */
    }
}
