package com.green.practice.day06.ch07;

public class DupRef {

    public static void main(String[] args) {

        BankAccount ba1 = new BankAccount();
        BankAccount ba2 = ba1; //객체의 주소값이 같다.
        //주소값 복사 == 얕은 복사 == Shallow Copy


        /*
        BankAccount ba1 가 의미하는 바는
        참조변수, 변수명 ba1, 주소값을 저장,
        BankAccount객체의 주소값만!!! 저장이 가능함.
         */

        ba1.deposit(1000); //ba1과 ba2는 같은 주소값이다.
        ba2.checkMyBalance();

    }
}