package com.green.practice.day03;

public class MissionWhile2Result {

    public static void main(String[] args) {

        int i = 1;
        while (i <= 100) {
            System.out.println(i++);
        }
        System.out.println("------------------");
        do {
            System.out.println(--i);
        } while (i > 1);


    }
}
