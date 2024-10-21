package com.green.practice.day10.ch13;

import java.util.Arrays;

public class Mission13_2_2 {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {1, 1, 1},
                {2, 2, 2}, //주소값을 잠시 temp에 옮겨둔다, shallow copy 이용
        };

        arrayChangeOrder(arr);
        System.out.println(Arrays.deepToString(arr));

    }

    public static void arrayChangeOrder(int[][] arr) {
        int lastIdx = arr.length - 1;
        int[] last = arr[lastIdx];
        for(int i = lastIdx; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }







}
