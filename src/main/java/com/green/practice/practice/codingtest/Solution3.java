package com.green.practice.practice.codingtest;

public class Solution3 {
    public int[] solution(int num1, int denom1, int num2, int denom2) {
        int[] answer = new int[2];

        answer[0] = num1 * denom2 + num2 * denom1;
        answer[1] = denom1 * denom2;

        int gcd = gcd(answer[0], answer[1]);

        answer[0] /= gcd;
        answer[1] /= gcd;

        return answer;

    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
