package com.green.practice.day08.ch11;

public class BuildString {

    public static void main(String[] args) {
        //문자열 "123"이 저장된 인스턴스 생성
        StringBuilder sb = new StringBuilder("123");
        sb.append(45678);

        System.out.println(sb);

        sb.delete(0,2);
        System.out.println(sb);

        //모든 문자열을 지우는 방법
        sb.delete(0, sb.length());
        System.out.println("sb:" + sb);

        sb.append(345678);
        System.out.println("sb: " + sb);

        sb.replace(0,3,"AB"); {
            System.out.println("sb: " + sb);
        }

        sb.replace(0, 3, "AB"); {
            String str = sb.toString(); //StringBuilder에서 String타입으로 변경 가능함

            System.out.println("sb:" + sb);
            System.out.println("str: " + str);

        }

        StringBuilder sb2 = sb.reverse().replace(0,2,"KK");
        //sb.reverse(); //나 자신의 주소값을 리턴하기 때문에 sb가 되는 것(나의 주소값, return this)
        //sb.replace(0,2,"KK"); //나 자신의 주소값을 리턴 (return this)
        //체이닝 기법, return this; 가 핵심

        System.out.println("sb: " + sb);
        System.out.println("sb == sb2: " + (sb == sb2));

    }
}
