package com.green.day05.ch07;

public class BankAccountPO {
    static int balance = 0; //static 전역변수 //static이 붙으면 객체화를 안 해도 된다.(static이 안 붙으면 객체화를 해야한다)

    public static int deposit(int amount){ //입금을 담당하는 메소드(행위)
        balance += amount;
        return balance;
    }

    static int withdraw(int amount) {
        balance -= amount;
        return balance;
    }

    static int checkMyBalance() {
        System.out.println("잔액: " + balance);
        return balance;
    }

}
