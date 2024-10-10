package com.green.practice.day03;

public class MissionWhile1 {

    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (i < 100) {
            sum += (i++);
        }
        System.out.println("sum= " + sum);

    }
}
