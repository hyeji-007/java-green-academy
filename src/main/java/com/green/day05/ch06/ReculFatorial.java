package com.green.day05.ch06;

public class ReculFatorial {

    public static void main(String[] args) {
        //5! >> 5 * 4 * 3 * 2 * 1
        //6! >> 6 * 5 * 4 * 3 * 2 * 1
        System.out.println(factorial(6));
        System.out.println(factorial(5));
        System.out.println(factorial(4));
        System.out.println(factorial(3));
        System.out.println(factorial(2));

    }

    static int factorial(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }



}
