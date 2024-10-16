package com.green.day06.ch07;

/*
    일반 변수(primitive type)
    참조 변수(reference type)
    차이점을 설명하는 예제


 */


public class PrimitiveVsReferenceTest {

    public static void main(String[] args) {

        int num = 10; //지역 변수, Primitive type
        Integer num2 = num; //멤버필드는 외부에서 접근하지 못하도록 private화 함.(method만 사용 가능) But 상수는 뜬다.
        changeNum(num); //changeNum(int num)과 공간이 다르다. primitive 타입 특.
        System.out.println("num: " + num); //10

        /*
        main메소드에 있는 num변수(main-num)와 changeNum메소드에 있는 num매개변수(m-num)는
        다른 공간이다. main-num이 가지고 있는 값을 복사하여 m-num에 저장했다.
        m-num값을 변경한다고 하여 main-num값이 변경되는 것은 아니다. 왜? 다른 공간이기 때문
         */


        NumberBox nb = new NumberBox(); // 1. nb에는 NumberBox 주소값이 저장되어 있다.(0x3)
        nb.num = 10;
        ChangeNum(nb); //nb: numberBox 객체 주소값(0x3)
        System.out.println("nb.num: " + nb.num); // 주소값 그대로(0x3)


    }

    public static void changeNum(int num) {
        num = 100;
    }

    /*
    main메소드에 있는 nb변수(main-nb)와 changeNum메소드에 있는 nb 매개변수(m-nb)는 다른 공간이다.
    다만 같은 값(주소값)을 가지고 있다. 그로 인해 같은 객체에 접근할 수 있다.
    m-nb를 통해 객체의 num값을 변경을 했다면 main-nb를 통해 접근했을 때 변경된 값을 얻게 된다.
     */

    /*
    public static void ChangeNum(NumberBox nb) { // 2. 다른 공간이지만 같은 주소값(0x3)
        nb.num = 100; // 3. 10 >> 100 (같은 객체의 주소값이기 때문에 접근이 가능하다)
    }
     */

    public static void ChangeNum(NumberBox nb) { // 2. 다른 공간(스코프)이지만 같은 주소값(0x3)
        nb = new NumberBox(); //새로운 객체 생성, num = 0 (0x4)

        nb.num = 100;
    }

}


class NumberBox {
    int num;
}