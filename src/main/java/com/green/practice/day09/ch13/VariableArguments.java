package com.green.practice.day09.ch13;

public class VariableArguments {
    public static void main(String[] args) {
        sum(10, 20, 33);

        sumVar(1); //[1] >> 1
        sumVar(1, 2); //[1, 2] >> 3
        sumVar(1, 2, 3); //[1, 2, 3] >>6
        sumVar(1, 2, 3, 1, 2, 3); //12
    }


    static void sumVar(int... values) {
        int sum = 0;
        for(int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        System.out.println("합계: " + sum);
    }


    static void sum(int n1, int n2) {
        sumVar(n1, n2, 0);
    }

    static void sum(int n1, int n2, int n3) {
        System.out.println(n1 + n2 + n3);
    }




}
