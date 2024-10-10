package com.green.practice.day03;

public class MissionContinueBreak3 {

    public static void main(String[] args) {

        int i = 1;
        int odd = 0;

        while (true) {
            System.out.println("i: " + i);
            odd += i;
            if (odd >= 1000) {
                break;
            }
            i += 2;
        }
        System.out.println("마지막 더한 값: " + i);
        System.out.println("odd: " + odd);



    }


}
