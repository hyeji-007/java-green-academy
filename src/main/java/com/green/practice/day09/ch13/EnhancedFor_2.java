package com.green.practice.day09.ch13;

public class EnhancedFor_2 {
    //향상된 for문, 강화된 for문, for-each문
    public static void main(String[] args) {
        int[] arr = { 10, 22, 7, 4, 80 };

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();

        for (int item : arr) {
            System.out.println(item);
        }
    }
}
