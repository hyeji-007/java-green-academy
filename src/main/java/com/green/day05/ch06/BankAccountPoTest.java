package com.green.day05.ch06;

public class BankAccountPoTest {

    public static void main(String[] args) {
        System.out.println("Balance: " + BankAccountPO.balance);
        int deposit = BankAccountPO.deposit(4000);
        deposit = BankAccountPO.deposit(4000);
        System.out.println("Balance: " + BankAccountPO.balance);
        System.out.println("deposit: " + deposit);

        deposit = BankAccountPO.withdraw(2000);
        System.out.println("deposit: " + deposit);
        deposit = BankAccountPO.checkMyBalance();
        System.out.println("잔액2: " + deposit);




    }
}
