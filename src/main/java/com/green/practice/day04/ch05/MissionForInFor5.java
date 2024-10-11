package com.green.practice.day04.ch05;

public class MissionForInFor5 {

    public static void main(String[] args) {

        int star = (int)(Math.random() * 6.0) + 3;
        System.out.println("star: " + star);

        for(int i = 1; i <= star; i++) {
            for(int z = star; z > i; z--) {
                System.out.print("_");
            }
            for(int t = 0; t < i; t++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = star; i > 0; i--) {
            for(int z = 1; z <= star; z++) {
                System.out.print(z < i ? "-" : "*");
            }
            System.out.println();
        }





    }
}
