package com.green.practice.day03;

public class ContinueBasic {

    public static void main(String[] args) {
        int n = 0;
        int count = 0;

        while((n++) < 100) {
            if((n % 5) != 0 || (n % 7) != 0) {
                continue;
            }
            count++;
            System.out.println("n = " + n);
        }
        System.out.println("count: " + count);

    }
}
