package com.green.practice.day08.ch11;

public class Mission11_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("990925-1012999");

        int dashIdx = sb.indexOf("-");
        sb.replace(dashIdx, dashIdx + 1, " ");
        System.out.println(sb);
    }

}
