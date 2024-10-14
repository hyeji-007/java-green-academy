package com.green.practice.day05.ch06.ex;

public class Mission06_1_2 {

    public static void main(String[] args) {
        abs(10, 3);
        abs(3, 10);
        abs(11, 7);
        abs(7, 11);
    }

    static void abs(int n1, int n2) {
        System.out.println(n1 > n2 ? n1 - n2 : n2 - n1);
    }




}
