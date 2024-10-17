package com.green.practice.day08.ch13;

public class ArrayInit {

    public static void main(String[] args) {
        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = (i + 1) * 10;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]: %d\n", i, arr[i]);
        }
    }
}
