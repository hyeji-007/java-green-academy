package com.green.practice.day05.ch06.ex;

public class ex06_1_2 {

    public static void main(String[] args) {
        abs(10, 20);
        abs(-10, -5);
    }

    static void abs(int n1, int n2) {
        if(n1 > n2) {
            System.out.println(n1 - n2);
        } else {
            System.out.println(n2 - n1);
        }
    }
}
