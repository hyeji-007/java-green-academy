package com.green.day07.ch07;

class BankAccount2 {
    private String accNumber; //계좌변호
    private String ssNumber; //주민번호
    private int balance; //잔액

    /*
    <생성자>
    생성자는 메소드의 한 종류
    멤버필드 >> 생성자 >> 메소드
    생성자를 하나라도 만들면 기본생성자를 자동으로 만들어주지 않는다.

    메소드와 다른점 2가지:
     1. 이름이 클래스명과 같다.
     2. 반환형(리턴타입)을 작성하지 않는다.

    생성자의 특징은 오로지 객체 생성할때만 호출할 수 있다.
    객체생성 이후에는 호출 불가

    생성자를 작성하지 않으면 기본생성자가 자동으로 만들어진다.
    그렇지만 생성자를 하나라도 작성을 하게되면 기본 생성자를 자동으로 만들어주지 않는다.
    그러면 기본 생성자를 만들어주어야 한다.

    <메소드>
    void initAccount(String acc, String ss, int bal) {
        accNumber = acc;
        ssNumber = ss;
        balance = bal;
    }
     */

    //기본 생성자의 모습
    BankAccount2() {
        super(); //생략 가능
    }

    //파라미터가 있는 생성자 or 오버로딩된 생성자
    BankAccount2(String acc, String ss, int bal) {
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

public class BankAccountConstructor {
    public static void main(String[] args) {
        /*
        객체 생성된 new 키워드 우측에 적는 것은 생성자 호출이다.
        모든 객체지향언어는 객체를 생성할 때 생성자를 호출해야 한다.
         */
        BankAccount2 ba1 = new BankAccount2(); //기본생성자 호출, 기본생성자가 있기 때문에 객체 생성 가능
        ba1.checkMyBalance();

        /*
        오버로딩(Overloading): 같은 이름의 메소드를 여러개 만들 수 있는 기법,
                               ( 파라미터가 다르면 가능 (순서나 개수) )
         */

        //파라미터가 있는 생성자 호출 or 오버로딩된 생성자 호출
        BankAccount2 ba2 = new BankAccount2("111-222", "998989-1778888", 10000);
        ba2.checkMyBalance();
    }
}
