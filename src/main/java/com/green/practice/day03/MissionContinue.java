package com.green.practice.day03;

public class MissionContinue {

    public static void main(String[] args) {

        int count = 0;
        for (int i = 1; i < 100; i++) {
            if ((i % 5) == 0 && (i % 7) == 0) {
                count++;
                System.out.println("i: " + i);
            }
        }
        System.out.println("count: " + count);
        System.out.println();


        int count2 = 0;
        for (int z = 1; z < 100; z++) {
            if ((z % 5) != 0 || (z % 7) != 0) {
                continue;
            }
            count2++;
            System.out.println("z: " + z);
        }
        System.out.println("count: " + count);


    }


}
