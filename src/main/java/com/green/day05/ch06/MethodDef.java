package com.green.day05.ch06;

public class MethodDef {
    public static void main(String[] args) {
        hiEveryone(12);
        hiEveryone(13);
    }

    static void hiEveryone(int n) {
        System.out.println("프로그램의 시작");
        System.out.println("좋은 아침입니다.");
        System.out.printf("제 나이는 %d세 입니다.\n", n);
        System.out.println("프로그램의 끝");
        System.out.println();
    }



}
