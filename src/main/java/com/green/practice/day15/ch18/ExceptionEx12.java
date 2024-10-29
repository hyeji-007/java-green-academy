package com.green.practice.day15.ch18;

public class ExceptionEx12 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("-- 끝 --");
    }
    static void method1() throws Exception {
        method2();
    }
    static void method2() throws Exception {
        throw new Exception("하하"); //throws 메소드에서만 사용할 수 있는 게 아니고 예외를 일부로 발생시키고 싶을 때
        //Exception 자체를 객체화해서 터뜨릴 수 있다.
    }
}
