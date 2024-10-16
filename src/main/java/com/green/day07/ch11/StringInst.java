package com.green.day07.ch11;

public class StringInst {
    public static void main(String[] args) {
        String str1 = new String("Simple String"); //str1은 String객체의 주소값만 저장한다.
        String str2 = "The Best String"; //권장, 둘 다 주소값 저장되는 것

        System.out.println(str1);
        System.out.println(str1.length()); //인스턴스 메소드(static이었다면 . 앞에 대문자가 붙었을 것)
        System.out.println();

        System.out.println(str2);
        System.out.println(str2.length());
        System.out.println();

        showString("Funny String");
    }

    public static void showString(String str) {
        System.out.println(str);
        System.out.println(str.length());
    }


}


