package com.green.day05.ch06;

public class Mission06_1_1 {

    public static void main(String[] args) {
        calc(10, 3);
    }

    static void calc(int n1, int n2) {
        System.out.printf("%s + %s = %s\n" , n1, n2, (n1 + n2));
        System.out.printf("%s - %s = %s\n" , n1, n2, (n1 - n2));
        System.out.println("n1 / n2 = " + (double)n1 / n2);
        System.out.printf("%s * %s = %s\n" , n1, n2, (n1 * n2));
        System.out.printf("%s %% %s = %s\n" , n1, n2, (n1 % n2));
    }







}
