package com.green.day06.ch07;

public class BankAccount { //class라고 하는 문서일 뿐이다. 객체화 해야 사용 가능함

    int balance = 0; //정수값 데이터만 저장할 수 있다, 멤버필드/멤버변수/전역변수

    void deposit(int amount) {
        balance += amount;
    }


    void withdraw(int amount) {
        balance -= amount;
    }

    void checkMyBalance() {
        System.out.printf("balance: %d\n", balance);
    }

}
