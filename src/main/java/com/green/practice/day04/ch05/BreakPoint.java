package com.green.practice.day04.ch05;

public class BreakPoint {

    public static void main(String[] args) {
        //구구단에서 곱의 결과가 72인 결과를 딱 하나만 보여라.

        outer:
        for(int dan = 1; dan < 10; dan++) {
            for (int i = 1; i < 10; i++) {
                if ((dan * i) == 72) {
                    System.out.printf("%d x %d = %d\n", dan, i, (dan * i));
                    break outer;
                }
            }
        }
        System.out.println("--끝--");

    }
}
