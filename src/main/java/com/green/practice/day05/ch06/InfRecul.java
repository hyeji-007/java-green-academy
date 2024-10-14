package com.green.practice.day05.ch06;

public class InfRecul {

    public static void main(String[] args) {
        showHi(3);
    }

    static void showHi(int cnt) {
        System.out.println("Hi~");
        if(cnt == 1) {
            return;
        }
        showHi(--cnt);
    }
}
