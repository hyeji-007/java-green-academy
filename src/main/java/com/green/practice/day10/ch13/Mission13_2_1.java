package com.green.practice.day10.ch13;

import java.util.Arrays;

public class Mission13_2_1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));

        addOneDArr(arr, 5); //두번째 인자의 값을 모든 방에 더해준다.
        System.out.println(Arrays.toString(arr));
        System.out.println();

        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6},
        };
        addTwoDArr(arr2, 3);
        System.out.println(Arrays.deepToString(arr2));

    }

    public static void addOneDArr(int[] arr, int add) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] += add;
        }
    }

    public static void addTwoDArr(int[][] arr, int add) {
        for(int z = 0; z < arr.length; z++) {
            addOneDArr(arr[z], add);
        }
    }





}
