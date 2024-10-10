package com.green.day03.ch05;

public class MissionContinue {

    public static void main(String[] args) {
        /*
         int n = 0;
        int count = 0;

        while( (n++) < 100 ) {
            if( ((n % 5) != 0) || ((n % 7) != 0)) {
                continue;
            }
            count++;
            System.out.println("n: " + n); //처음 출력되는 n의 값?
        }
        System.out.println("count: " + count);

         */

        int count = 0;

        for (int n = 1; n < 100; n++) {
            if( ((n % 5) == 0) && ((n % 7) == 0)) {
                count ++;
                System.out.println("n: " + n);
            }
        }
        System.out.println("count: " + count);


        int count2 = 0;
        for (int n = 1; n < 100; n++) {
            if ( ((n % 5) != 0) || ((n % 7) != 0) ) {
                continue;
            }
            count2++;
            System.out.println("n = " + n);
        }
        System.out.println("count = " + count);







    }
}


