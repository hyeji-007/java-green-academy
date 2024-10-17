package com.green.day08.ch13;

public class ArrayInstance2 {
    public static void main(String[] args) {
        Box[] arr = new Box[5]; //클래스 타입의 reference 변수는 <Box 객체의 주소값>을 저장할 수 있다.
        System.out.println(arr.length);

        //Box b0, b1, b2, b3, b4;

        Box b1 = new Box("안녕");
        System.out.println(b1); //객체를 어떻게 문자열로 바꿀까?
        System.out.println(b1.toString());

        arr[0] = b1;
        arr[1] = new Box("하세요");
        arr[2] = new Box("반갑습니다.");
        //arr[3] = new String("ddd");
        System.out.println("---------------");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

    }
}

//모든 클래스는 무조건 Object를 상속받는다.
class Box {
    private String conts;

    Box(String conts) { //toString이 없으면 object에 있는 메소드를 호출한다.//모든 클래스는 <object에게 상속받기 때문에> 알지못하는 메소드를 사용할 수 있다.
        this.conts = conts;
    }

    //@Overriding 오버라이딩
    public String toString() { //객체를 문자열로 바꿈 (overRiding: 덮어쓰는 느낌), 부모가 가지고있는 메소드를 그대로 사용해도 되는데 내가 새롭게 정의하고 싶음
        return conts; //오버라이딩이 되지 않으면 @4535345
    }

}


