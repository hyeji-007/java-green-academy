package com.green.practice.practice.codingtest;

public class MaxCount {

    public void solution(int[] array) {
        //1. 주어진 배열의 숫자 범위에 맞는 카운트 배열 생성
        int[] countArray = new int[1001];

        //2. 배열 순회하면서 각 숫자의 등장 횟수 기록
        for (int num : array) {
            countArray[num]++; //숫자에 해당하는 인덱스의 값 증가
        }

        //3. 최빈값 찾기
        int mode = -1;
        int maxCount = 0;

    }
}
