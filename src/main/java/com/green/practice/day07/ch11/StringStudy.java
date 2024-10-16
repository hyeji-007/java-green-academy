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

        System.out.println("-------------------");
        String str6 = "abcdefghijklmn";
        System.out.println("str6.substring(3): " +str6.substring(3)); //substring은 return 메소드
        //.substring >> 파일명에서 확장자 추출할 때 사용

        System.out.println("str6.substring(4,7): " + str6.substring(4,7)); // 4,5,6까지 문자열 리턴(7전까지)

        String fileNm = "nice_v.ery.Nice.jpg";
        System.out.println(".의 위치값: " + fileNm.indexOf(".")); //왼쪽에서 오른쪽 방향으로 가장 빨리 찾은 index 값을 리턴

        System.out.println("마지막 .의 위치값: " + fileNm.lastIndexOf("."));

        System.out.println("-------------------");

        int n = 10;
        String str9 = n + "";
        String str10 = String.valueOf(n); //모든 타입을 String으로 변경할 수 있다.




    }
}
