package com.green.practice.day04.ch05;

public class Mission05_7_2 {

    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) {
            for(int z = 0; z < 10; z++) {
                if( (i + z) == 9) {
                    System.out.printf("%d, %d\n", i, z);
                }
            }
        }
    }
}
