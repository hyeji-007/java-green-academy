package com.green.day05.ch07;

public class BankAccountPoTest2 {

    public static void main(String[] args) {

        BankAccountPO po1 = new BankAccountPO();
        po1.deposit(1000);
        po1.checkMyBalance();

        BankAccountPO po2 = new BankAccountPO();
        po2.checkMyBalance(); //static은 객체화(new)와 전혀 상관 x

        BankAccountPO.checkMyBalance();
        //static이 안 붙은 메소드를 사용하려면 객체생성부터 해야한다.

    }
}
