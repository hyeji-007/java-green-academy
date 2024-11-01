package com.green.practice.practice.codingtest;

import java.util.ArrayList;

public class Solution4_2 {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i <= n; i +=2) {
            list.add(i);
        }

        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
