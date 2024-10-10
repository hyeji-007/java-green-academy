package com.green.practice.day03;

public class MissionWhileResult {
    public static void main(String[] args) {
        /*
    while문을 활용하여 1~99까지의 합을 구하는 프로그램을 작성하시오.
    rsult = 4950
    1. 1~99의 값을 만들 수 있어야 한다.
    2. 만든 값을 중첩해서 저장할 수 있어야 한다.
     */

        int n = 1;
        int sum = 0;

        while (n < 100) {
            sum += (n++);
        }
        System.out.println("result= " + sum);
        System.out.println("--끝--");


    }
}
