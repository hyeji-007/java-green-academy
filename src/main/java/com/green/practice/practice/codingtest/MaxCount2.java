package com.green.practice.practice.codingtest;

public class MaxCount2 {
    public int solution(int[] array) {
        int[] countArray = new int[1001];


        for (int num : array) {
            countArray[num]++;
        }

        int mode = -1;
        int maxCount = 0;
        boolean isUnique = true;

        for (int i = 0; i < countArray.length; i++) {
            if (countArray[i] > maxCount) {
                maxCount = countArray[i];
                mode = i;
                isUnique = true;
            } else if (countArray[i] == maxCount) {
                isUnique = false;
            }
        }

        return isUnique ? mode : -1;
    }
}

