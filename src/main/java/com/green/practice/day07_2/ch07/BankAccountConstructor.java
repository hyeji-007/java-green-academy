package com.green.practice.day07_2.ch07;

class BankAccount2 {
    private String accNumber;
    private String ssNumber;
    private int balance;

    //기본 생성자
    BankAccount2() {

    }

    //파라미터가 있는 생성자 or 오버로딩된 생성자
    BankAccount2(String acc, String ss, int bal) {
        accNumber = acc;
        ssNumber = ss;
        balance = bal;
    }

    //메소드
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
        System.out.printf("잔   액: %,d\n", balance);
    }

}


public class BankAccountConstructor {
    public static void main(String[] args) {
        /*
        객체 생성된 new 키워드 우측에 적는 것은 생성자 호출이다.
        모든 객체지향 언어는 객체를 생성할 때 생성자를 호출해야 한다.
         */
        BankAccount2 ba1 = new BankAccount2(); //기본생성자 호출
        ba1.checkMyBalance();

        //파라미터가 있는 생성자 호출
        BankAccount2 ba2 = new BankAccount2("111-222", "990909-1778888", 10000);
        ba2.checkMyBalance();
    }
}
