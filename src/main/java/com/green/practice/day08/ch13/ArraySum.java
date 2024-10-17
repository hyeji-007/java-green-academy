package com.green.practice.day08.ch13;

public class ArraySum {

    public static void main(String[] args) {
        int[] arr = {10, 15, 23, 1, 8};

        int total = 0;

        for(int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println(total);



    }
}
