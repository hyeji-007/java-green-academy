package com.green.practice.day03;

public class MissionForInFor {

    public static void main(String[] args) {

        for (int i = 2; i < 10; i++) {
            for (int z = 1; z < 10; z++) {
                System.out.printf("%d x %d = %d\n", i, z, (i * z));
            }
            System.out.println("------------------------------");
        }


    }
}
