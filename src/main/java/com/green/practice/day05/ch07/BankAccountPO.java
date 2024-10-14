package com.green.practice.day05.ch07;

public class BankAccountPO {
    static int balance = 0; //예금 잔액

    public static void main(String[] args) {
        deposit(10000); //입금 진행
        checkMyBalance(); //잔액 확인
        withdraw(3000); //출금 진행
        checkMyBalance(); //잔액 확인
    }

    static int deposit(int amount) { //입금을 담당하는 메소드
        balance += amount;
        return balance;
    }

    static int withdraw(int amount) { //출금을 담당하는 메소드
        balance -= amount;
        return balance;
    }

    static int checkMyBalance() {
        System.out.println("잔액: " + balance);
        return balance;
    }






}
