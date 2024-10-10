package com.green.practice.day03;

public class MissionForInFor3_1 {

    public static void main(String[] args) {

        int star = (int)(Math.random() * 6.0) + 3;
        System.out.println("star: " + star);

        int len = star * star;
        for (int i = 1; i <= len; i++) {
            System.out.print("*");

            if (i % star == 0) {
                System.out.println();
            }
        }



    }
}
