package com.green.day06.ch07;

public class BankAccountTest {

    public static void main(String[] args) {

        //BankAccount.deposit(4000);
        //BankAccount: 참조 타입(Reference type) <-> 기본 타입(Primitive type)
        //              -> 참조 타입: 객체의 주소값을 저장한다.
        //ba는 BankAccount 객체 주소값만 담을 수 있는 참조변수이다.
        BankAccount ba = new BankAccount(); //객체 생성 >> 객체의 주소값이 ba에 저장된다.
        //BankAccount는 reference 변수

        ba.deposit(1000);
        ba.checkMyBalance();
        ba.deposit(2000);
        ba.checkMyBalance();


        BankAccount ba3 = new BankAccount(); //객체2 생성(다른 주소값(객체), 별개임)
        ba3.checkMyBalance(); //balance: 0
        ba3.deposit(40000);
        ba3.withdraw(1000);
        ba3.checkMyBalance(); //balance: 39000

        ba.checkMyBalance(); //balance: 3000

        //BankAccount ba2 = new String("안녕"); //ba2는 String객체 주소값을 담을 수 없다.
        String str = new String("안녕");






    }
}
