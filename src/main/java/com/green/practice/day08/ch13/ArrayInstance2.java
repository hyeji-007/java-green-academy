package com.green.practice.day08.ch13;

public class ArrayInstance2 {
    public static void main(String[] args) {
        Box[] arr = new Box[5];
        //클래스 타입의 reference 변수는 <Box 객체의 주소값>을 저장할 수 있다.
        System.out.println(arr.length);

        Box b1 = new Box("안녕");
        System.out.println(b1); //객체를 어떻게 문자열로 바꿀까?
        System.out.println(b1.toString());

        arr[0] = b1;
        arr[1] = new Box("하세요");
        arr[2] = new Box("반갑습니다.");

        System.out.println("-----------------");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

    }
}

//모든 클래스는 무조건 object를 상속받는다.
class Box {
    private String conts;

    Box(String conts) {
        this.conts = conts;
    }

    //@Overriding 오버라이딩
    public String toString() {
        return conts;
    }

}
