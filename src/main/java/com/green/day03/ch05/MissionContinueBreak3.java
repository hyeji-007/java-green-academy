package com.green.day03.ch05;

public class MissionContinueBreak3 {

    public static void main(String[] args) {

        int i = 1;
        int odd = 0;
        while (true) {
            System.out.println("i: " + i);
            odd += i;
            if(odd >= 1000) {
                break;
            }
            i += 2;
        }
        System.out.printf("마지막 더한 값: %d\n", i);
        System.out.println("odd: " + odd);






    }
}
