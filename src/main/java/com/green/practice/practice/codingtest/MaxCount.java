package com.green.practice.practice.codingtest;

public class MaxCount {

    public int solution(int[] array) {
        //1. 주어진 배열의 숫자 범위에 맞는 카운트 배열 생성
        int[] countArray = new int[1001];

        //2. 배열 순회하면서 각 숫자의 등장 횟수 기록
        for (int num : array) {
            countArray[num]++; //숫자에 해당하는 인덱스의 값 증가
        }

        //3. 최빈값 찾기
        int mode = -1;
        int maxCount = 0;

        for (int i = 0; i < countArray.length; i++) {
            if (countArray[i] > maxCount) {
                maxCount = countArray[i];
                mode = i; //현재 인덱스가 최빈값
            } else if (countArray[i] == maxCount) {
                mode = -1; //최빈값이 여러개면 -1로 설정
            }
        }
        return mode;
    }

    public static void main(String[] args) {
        MaxCount finder = new MaxCount();
        int[] array = {1, 2, 2, 3, 3, 3, 4};
        System.out.println("최빈값: " + finder.solution(array));
    }
}
