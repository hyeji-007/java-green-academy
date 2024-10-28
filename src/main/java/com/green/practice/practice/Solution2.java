package com.green.practice.practice;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = gcd(a, b);
        int min = (a * b) / gcd;
        //두 수의 곱을 최대공약수로 나누면 최소공배수
        System.out.println("최소공배수: " + min);


    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
