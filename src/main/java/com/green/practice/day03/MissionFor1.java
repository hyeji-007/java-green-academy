package com.green.practice.day03;

public class MissionFor1 {

    public static void main(String[] args) {

        int n = 1;
        for (int i = 2; i <= 10; i++) {
            n *= i;
        }
        System.out.printf("%,d\n", n);
    }

}
