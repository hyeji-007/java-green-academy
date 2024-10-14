package com.green.day05.ch06.mission;

public class Mission06_1_2 {

    public static void main(String[] args) {
        abs(10, 3);
        abs(3, 10);
        abs(11, 7);
        abs(7, 11);
    }

    static void abs(int n1, int n2) {
        if(n1 > n2) {
            System.out.println(n1 - n2);
        }else {
            System.out.println(n2 - n1);
        }
    }

    static void abs2(int n1, int n2) {
        int r = n1 - n2;
        System.out.println(r < 0 ? -r : r);
    }

    static void abs3(int n1, int n2) {
        System.out.println(n1 > n2? n1 - n2 : n2 - n1);
    }





}
