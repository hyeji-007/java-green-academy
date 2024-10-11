package com.green.day04.ch05;

public class MissionForInFor3 {
    public static void main(String[] args) {

        int star = (int)(Math.random() * 6.0) + 3;
        System.out.println("star: " + star);

        for(int i = 1; i <= star; i++ ){
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
