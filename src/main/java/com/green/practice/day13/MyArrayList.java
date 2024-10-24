package com.green.practice.day13;

public class MyArrayList {
    private int[] arr;

    public MyArrayList() {

    }

    public void add(int num) {
        int[] tmp = new int[arr.length + 1];

        for(int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        tmp[arr.length] = num;
        arr = tmp;
    }
}
