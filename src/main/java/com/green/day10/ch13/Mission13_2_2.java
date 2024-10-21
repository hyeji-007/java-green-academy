package com.green.day10.ch13;

import java.util.Arrays;

public class Mission13_2_2 {
    /*
    다음 형태로 표현된 2차원 배열이 존재한다고 가정해보자.
    1  2  3 >> 1행
    4  5  6 >> 2행
    7  8  9 >> 3행
     */

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

    public static void arrayChangeOrder(int[][] arr) { //배열에 접근할 수 있는 주소값이 파라미터로 들어옴
        int lastIdx = arr.length - 1; //마지막 줄 arr4
        int[] last = arr[lastIdx]; // arr4의 주소값을 last에 옮겨둔다.
       for(int i = lastIdx; i > 0; i--) {
           arr[i] = arr[i - 1]; //n번방에 (n-1)번 방의 값을 복사한다.
       }
       arr[0] = last; //0번방에 마지막으로 복사해둔 값을 넣는다.
    }


   /*
    public static void arrayChange(int[][] arr, int n) {
        int t = 1;
        for(int i = 0; i < arr.length; i++) {
            for(int z = 0; z < arr[i].length; z++) {
                arr[i][z] = t++;
            }
        }
    }

    */






}
