package com.green.day03.ch05;

public class MissionForInFor3 {

    public static void main(String[] args) {

        int star = (int)(Math.random() * 6 + 3.0);
        System.out.println(star);

        for (int i = 0; i < star; i++) {
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


















    }
}
