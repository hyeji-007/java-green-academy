package com.green.day10.ch13;

import java.util.Arrays;

public class Mission13_2_1 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        addOneDArr(arr, 3); //두번째 인자의 값을 모든 방에 더해준다.
        System.out.println(Arrays.toString(arr));

        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        addTwoDArr(arr, 4);  //메소드 재활용성을 극대화 시킨다.

        for(int[] item : arr2) {
            System.out.println(Arrays.toString(item));
        }



    }


    //int[] 객체의 각 방의 타입: int
    //int[][] 객체의 각 방의 타입: int[]

    public static void addTwoDArr(int[] arr, int add) {
        for (int i = 0; i < arr.length; i++) {
            addOneDArr(arr[i], add);
        }
    }

    private static void addOneDArr(int i, int add) {
    }

    public static void addOneDArr(int[] arr, int n) {
        //향상된 for문은 배열에 있는 값을 다른 데로 복사하고 다른 고친다.
        //배열의 각 방의 값을 고쳐야 하는데 다른 곳을 수정한다.
        for (int i = 0; i < arr.length; i++) {
            arr[i] += n;
        }

    }



}
