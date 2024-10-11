package com.green.day04.ch05;

public class MissionForInFor5_2 {

    public static void main(String[] args) {
        int star = (int)(Math.random() * 6.0) + 3;
        System.out.println("star: " + star);

        for(int i = 0; i < star; i++) {
            for (int z = 0; z <= star; z++) {
                if (z < (star-i)) {
                    System.out.print("-");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println("----------------------------------");


        for (int i = 1; i <= star; i++) {
            for (int z = 0; z < star; z++) {
                if (z >= (star - i)) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
        System.out.println("----------------------------------");

        for (int i = 1; i <= star; i++) {
            for(int j = 0; j < (star-i); j++) {
                System.out.print("-");
            }

            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
