package com.green.practice.day04.ch06;

public class MethodGugudan {

    public static void main(String[] args) {
        gugudan(4);
        System.out.println("-----------------");
        gugudan(6);
        System.out.println("-----------------");
        gugudanFromTo(5, 9); //5~9단까지 출력
        System.out.println("-----------------");
        gugudanFromTo(2, 4); //2~4단까지 출력
        System.out.println("-----------------");
    }

    static void gugudanFromTo(int from, int to) {
        for(int i = from; i <= to; i++) {
            gugudan(i);
            System.out.println();
        }
    }


    static void gugudan(int n) {
        for(int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, (n * i));
        }
    }








}
