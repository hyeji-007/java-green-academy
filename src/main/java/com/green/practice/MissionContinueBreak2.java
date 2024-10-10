package com.green.practice;

public class MissionContinueBreak2 {

    public static void main(String[] args) {

        int i = 0;
        int odd = 0;

        while (odd < 1000) {
            i++;
            if ( (i % 2) == 1) {
                System.out.println("i: " + i);
                odd += i;
            }
        }
        System.out.println("마지막 더한 값: " + i);
        System.out.println("odd: " + odd);




    }
}
