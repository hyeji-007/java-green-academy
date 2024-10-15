package com.green.day05.ch06;

public class MethodReturns {

    public static void main(String[] args) {
        int result;
        result = adder(4, 5); //return 메소드
        System.out.printf("%d + %d = %d\n", 4, 5, result);
        System.out.printf("%.1f x %.1f = %.1f\n", 3.5, 3.5, square(3.5));

    }

    static int adder(int n1, int n2) { //int로 리턴한다고 약속
        return n1 + n2;

        /*
        int r = n1 + n2;
        return r;
         */

    }

    static double square(double n) {
        return n * n;
    }





}
