package com.green.practice.day04.ch05;

public class MissionoForInFor3 {

    public static void main(String[] args) {
        int star = (int)(Math.random() * 6.0) + 3;
        System.out.println("star: " + star);

        for(int i = 0; i < star; i++) {
            for(int z = 0; z <= i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
