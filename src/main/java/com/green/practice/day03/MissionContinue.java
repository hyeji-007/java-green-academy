package com.green.practice.day03;

public class MissionContinue {

    public static void main(String[] args) {

       int count = 0;

       for(int n = 1; n < 100; n++) {
           if( (n%5)==0 && (n%7)==0) {
               count++;
               System.out.println(n);
           }
       }
    }


}
