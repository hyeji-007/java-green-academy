package com.green.practice.day05.ch06.ex;

public class ex06_2 {

    public static void main(String[] args) {
        System.out.println("원의 넓이: " + calCircleArea(2.4));
        System.out.println("원의 둘레: " + calCircleRound(2.4));
    }

    static double calCircleArea(double rad) {
        final double PI = 3.14;
        return rad * rad * PI;

    }

    static double calCircleRound(double rad) {
        final double PI = 3.14;
        return 2 * rad * PI;
    }

}
