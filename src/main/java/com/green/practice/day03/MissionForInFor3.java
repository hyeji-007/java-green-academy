package com.green.practice.day03;

public class MissionForInFor3 {

    //3~8
    public static void main(String[] args) {
        int star = (int)(Math.random() * 6.0) + 3;
        System.out.println("star: " + star);

        for (int i = 0; i < star; i++) {
            for (int z = 0; z < star; z++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
