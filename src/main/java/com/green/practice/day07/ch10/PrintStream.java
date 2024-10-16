package com.green.practice.day07.ch10;

public class PrintStream {
    public static void main(String[] args) {

        //System.abc.kkk().ggg >> 객체 주소값.ggg >> (.)이 뒤에 붙을 경우엔 100프로 참조타입

        //System.abc의 결과값을 "A" 지칭하자
        //A.kkk().ggg

        //A.kkk()의 결과값을 "B" 지칭하자

        //B.ggg

        //System: 클래스
        //abc: 참조변수, 멤버필드
        //kkk(): abc가 가리키고 있는 객체의 메소드. 리턴타입은 참조타입이다. (왜? 뒤에 .ggg가 붙었기 때문)
        //ggg: kkk()메소드가 리턴하는 객체의 멤버필드

        System.out.println();

        //PrintStream fff = System.out; //out 주소값을 복사해서 fff에 담는다
        //fff.println(); //그 객체가 가지고 있는 메소드 호출

        //System: 클래스
        //out: static final 멤버필드. PrintStream 객체의 주소값을 담을 수 있다.
        //println(): 메소드

        /*
        PrintStream은 Println(int i), println(char c), println(String str) 등의 메소드를 가지고 있고
        이것은 오버로딩이다.
        만약, 오버로딩이 없다면
        printlnInt(int i), pintlnChar(char c), PrintlnString(String str)
        이런식으로 메소드를 만들어야만 한다.

         */



    }
}
