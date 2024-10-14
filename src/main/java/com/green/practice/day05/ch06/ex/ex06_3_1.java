package com.green.practice.day05.ch06.ex;

public class ex06_3_1 {
    public static void main(String[] args) {
        System.out.println("powerofTwo(5): " + powerofTwo(5));
        System.out.println("powerofTwo(3): " + powerofTwo(3));
    }

    static int powerofTwo(int n) {
        if(n == 0) {
            return 1;
        }
        return 2 * powerofTwo(n-1);
    }


}
