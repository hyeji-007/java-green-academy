package com.green.practice.day05.ch06.ex;

public class ex06_2_2 {

    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            if(isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isPrimeNumber(int num) {
        if(num == 1) {
            return false;
        }

        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
