package com.green.day03.ch05;

public class MissionContinueBreak {

    public static void main(String[] args) {

        int sum = 0;
        int count = 0;


        for ( int i = 1; ; i++ ) {
            if ( i % 2 != 0 ) {
                    count++;
                    sum += i;
                }
            if ( sum > 1000 ) {
                break;
            }
        }
        System.out.println("sum = " + sum);
        System.out.println("count = " + count);








    }
}
