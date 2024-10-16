package com.green.practice.day07.ch07;

class BankAccount {
    private String accNumber;
    private String ssNumber;
    private int balance;

    void initAccount(String acc, String ss, int bal) {
        accNumber = acc;
        ssNumber = ss;
        balance = bal;
    }

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        balance -= amount;
    }

    void checkMyBalance() {
        System.out.printf("계좌번호: %s\n", accNumber);
        System.out.printf("주민번호: %s\n", ssNumber);
        System.out.printf("잔   액: %d\n", balance);
    }
}

public class BankAccountUnild {

    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
        ba1.initAccount("12-34", "3434", 10000);

        BankAccount ba2 = new BankAccount();
        ba2.initAccount("234", "234234", 3000);

        ba1.checkMyBalance();
        ba2.checkMyBalance();
    }
}
