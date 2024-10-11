package com.green.day04.ch05;

public class Mission05_7_1 {
    public static void main(String[] args) {

        for(int dan = 2; dan <= 8; dan+=2) {
            for (int z = 1; z <= dan; z++) {

                System.out.printf("%d x %d = %d\n", dan, z, (dan*z));

            }
            System.out.println();
        }
    }
}

