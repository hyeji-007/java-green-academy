package com.green.day04.ch05;

public class Mission05_7_2 {

    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) {
            for(int z = 0; z < 10; z++) {
               if (((i * 10) + z) + ((z * 10) + i) == 99) {
                   System.out.printf("A: %d, B: %d", i, z);
                   break;
               }
            }

            System.out.println();
        }

        for(int i = 0; i < 10; i++) {
            for(int z = 0; z < 10; z++) {
                if (i + z == 9) {
                    System.out.printf("%d, %d\n", i, z);
                }
                }
            }







    }
}
