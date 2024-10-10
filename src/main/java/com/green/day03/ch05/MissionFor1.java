package com.green.day03.ch05;

public class MissionFor1 {

    public static void main(String[] args) {

        /*
        int sum = 1;
        for (int i = 1; i <= 10; i++) {
            sum = sum * i;
        }
        System.out.println(sum);
         */

        int n = 1;
         for (int i = 2; i <= 10; i++) {
             //n = n * i
             n *= i;
         }
        System.out.printf("%,d\n", n);


        /*
        n = 1 * 2;  n = 2;
        n = 1 * 2 * 3;  n = 6
        n = 1 * 2 * 3 * 4;  n = 24

        n = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10;
        n = 2 * 3 * ...
        n = 6 * 4 * 5 * ...
         */




        }
}

