package com.green.practice.day08.ch13;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = new int[20];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        //0~19
        int temp;

        for(int i = 0; i < arr.length; i++) {
            int rIdx = (int)(Math.random() * arr.length);

            temp = arr[i];
            arr[i] = arr[rIdx];
            arr[rIdx] = temp;
        }
        System.out.println(Arrays.toString(arr));



    }
}
