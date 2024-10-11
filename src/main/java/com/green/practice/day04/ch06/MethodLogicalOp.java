package com.green.practice.day04.ch06;

public class MethodLogicalOp {

    public static void main(String[] args) {
        int n1 = 113;
        boolean b = logicalOp1(n1);
        System.out.println("b: " + b);
        //값이 1이상 100이하라면 true, 아니라면 false
        boolean b2 = logicalOp2(n1); //2배수거나 3배수이면 true, 아니면 false
        System.out.println("b2: " + b2);
    }


}
