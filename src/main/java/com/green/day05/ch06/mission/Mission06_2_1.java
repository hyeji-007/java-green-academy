package com.green.day05.ch06.mission;

public class Mission06_2_1 {
    public static void main(String[] args) {
        System.out.printf("원의 넓이: %.2f, 원의 둘레: %.2f\n", circleSpace(3), circleRound(3));
        System.out.printf("원의 넓이: %.2f, 원의 둘레: %.2f\n", circleSpace(5), circleRound(5));
    }

    static double circleSpace(double r) { //넓이
        return r * r * 3.14;
    }

    static double circleRound(double r) { //둘레
        return 2 * r * 3.14;
    }


}
