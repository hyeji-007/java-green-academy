package com.green.day03.ch05;

public class MissionContinueBreak2 {

    public static void main(String[] args) {

        int i = 0;
        int odd = 0;
        while (odd < 1000) {
            i++;
            if ( (i % 2) == 1 ) { //i값을 2로 나눴을 때 나머지 값이 1이면 >> 홀수
                //odd = odd + i
                System.out.println("i: " + i);
                odd += i;
            }
        }
        System.out.printf("마지막 더한 값: %d\n", i);
        System.out.println("odd: " + odd);







    }
}
