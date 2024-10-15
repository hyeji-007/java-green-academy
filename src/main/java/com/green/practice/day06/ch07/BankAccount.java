package com.green.practice.day06.ch07;

public class BankAccount { //멤버필드, 멤버변수, 젼역변수

    int balance = 0;

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

