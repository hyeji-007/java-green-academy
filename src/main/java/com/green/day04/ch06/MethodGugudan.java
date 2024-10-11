package com.green.day04.ch06;

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
        for(int dan = from; dan <= to; dan++) {
//            for(int t = 1; t < 10; t++) {
//                System.out.printf("%d x %d = %d\n", i, t, (i * t));
//            }
            gugudan(dan);
        }
    }



    static void gugudan(int dan) {
        for (int t = 1; t < 10; t++) {
                System.out.printf("%d x %d = %d\n", dan, t, (dan * t));
            }
        }
}

