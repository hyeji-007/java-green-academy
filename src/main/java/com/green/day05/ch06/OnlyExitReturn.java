package com.green.day05.ch06;

public class OnlyExitReturn {

    public static void main(String[] args) {
        devide(4, 2);
        devide(6, 2);
        devide(9, 0);

        /*
        0으로 숫자를 나누려고 하면 수학적 예외가 발생이 된다.
        이러한 예외가 발생되지 않도록 작업을 하는 것을 "예외처리"라고 한다.
        예외처리하는 방법은 크게 2가지
         - 예외가 발생되는 상황을 나오지 않게 한다.
         - 예외가 발생되는 상황을 try-catch로 해결한다.
         */
    }

    static void devide(int n1, int n2){
        System.out.printf("나눗셈 결과: %d\n", (n1 / n2));
    }








}
