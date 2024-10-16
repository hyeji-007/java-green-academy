package com.green.practice.day07.ch11;

public class StringStudy {
    public static void main(String[] args) {
        String str1 = "Coffee";
        String str2 = "Bread";

        String str3 = str1.concat(str2); //문자열 합치기
        System.out.println(str3);

        String str4 = str1 + str2;
        System.out.println(str4);

        String str5 = str2.concat(str1);
        System.out.println("str1: " + str1); //원본이 수정되지 않는다.
        System.out.println("str2: " + str2);
        System.out.println(str5);

    }
}
