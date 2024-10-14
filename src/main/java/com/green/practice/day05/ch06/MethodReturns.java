package com.green.practice.day05.ch06;

public class MethodReturns {
    public static void main(String[] args) {
        int result = adder(4, 5); //adder가 반환하는 값을 result에 저장
        System.out.println("4 + 5 = " + result);
        System.out.println("3.5 * 3.5 = " + square(3.5));
    }

    public static int adder(int num1, int num2) {
        int addResult = num1 + num2;
        return addResult; //addResult의 값을 반환
    }

    public static double square(double num) {
        return num * num; // num * num의 결과를 반환
    }
}
