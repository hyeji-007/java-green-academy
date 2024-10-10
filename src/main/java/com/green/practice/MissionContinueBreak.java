package com.green.practice;

public class MissionContinueBreak {

    public static void main(String[] args) {

        int odd = 0;
        int count = 0;

        for (int i = 1; ; i++) {
            if ( i % 2 == 1) {
                count ++;
                odd += i;
            }

            if (odd > 1000) {
                break;
            }
        }

        System.out.println("odd = " + odd);
        System.out.println("count = " + count);

    }
}
