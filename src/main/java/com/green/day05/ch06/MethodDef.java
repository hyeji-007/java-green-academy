package com.green.day05.ch06;

public class MethodDef {
    public static void main(String[] args) {
        System.out.println("프로그램의 시작");
        hiEveryone(12);
        hiEveryone(13);
        System.out.println("프로그램의 끝");
    }

    static void hiEveryone(int age) { //메소드 선언부( 리턴 타입, 메소드명, parameter(매개변수) )
        System.out.printf("좋은 아침입니다.\n제 나이는 %d세 입니다.\n", age); //메소드 구현부
    }



}
