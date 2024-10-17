package com.green.practice.day08;

class Calculator {
    //두 수를 더하는 메소드
    public int add(int a, int b) {
        return a + b;
    }

    //두 수를 곱하는 메소드
    public int multiply(int a, int b) {
        return a * b;
    }

}


public class Main2 {

    public static void main(String[] args) {
        //calculator 객체 생성
        Calculator calc = new Calculator();

        //메소드 호출
        int sum = calc.add(5,3);
    }
}
