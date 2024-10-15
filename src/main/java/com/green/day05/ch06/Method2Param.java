package com.green.day05.ch06;

public class Method2Param {

    public static void main(String[] args) {
        double myHeight = 175.9;
        hiEveryone(12, 12.5); //메소드 호출(use), 인수/인자/Argument
        hiEveryone(13, myHeight);
        byEveryone();
    }


    static void hiEveryone(int age, double height) { //메소드 정의(make), Parameter/매개변수
        System.out.printf("제 나이는 %d세 입니다.\n저의 키는 %.1fcm 입니다.\n", age, height);
    }

    static void byEveryone() {
        System.out.println("다음에 뵙겠습니다.");
    }














}
