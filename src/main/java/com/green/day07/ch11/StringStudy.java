package com.green.day07.ch11;

public class StringStudy {
    public static void main(String[] args) {
        String str1 = "Coffee";
        String str2 = "Bread";

        String str3 = str1.concat(str2);
        System.out.println(str3);

        String str4 = str1 + str2;
        System.out.println(str4);

        String str5 = str2.concat(str1);
        System.out.println("str1: " + str1); //원본이 수정되지 않는다.
        System.out.println("str2: " + str2);
        System.out.println(str5);

        System.out.println("-------------------");
        String str6 = "abcdefghijklmn";
        System.out.println("str6.substring(3): " + str6.substring(3)); //substring은 return 메소드
        //.substring >> 파일명에서 확장자 추출할 때 사용

        System.out.println("str6.substring(4, 7): " + str6.substring(4, 7)); //4, 5, 6 (7전까지)

        System.out.println("-------------------");

        String str7 = "Lexi";
        String str8 = "lexi";

        System.out.println(str7.equals(str8));
        System.out.println(str7.compareTo(str8));
    }
}
