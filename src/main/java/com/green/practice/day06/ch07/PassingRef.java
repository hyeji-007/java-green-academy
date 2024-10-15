package com.green.practice.day06.ch07;

public class PassingRef {

    public static void main(String[] args) {

        BankAccount ba = new BankAccount();
        ba.deposit(1000);
        ba.deposit(2000);

        BankAccount ba2 = ba; //shallow copy, ba2와 ba는 같은 주소값을 공유
        ba2.checkMyBalance(); //3000
        ba.checkMyBalance(); //3000

        ba2 = null; //null의 의미는 객체를 가르키고 있지 않다.(주소값 없다)
        if(ba2 != null) { //null 체크
            ba2.checkMyBalance();
        }

        /*
        ba2.checkMyBalance();
        null인 상태에서 메소드 호출을 하면 NullpointerException이 발생
        null인 상태에서 메소드 호출을 하면 안됨
         */

        /*
        ba2 = new BankAccount();
        새롭게 주소값을 저장할 수 있다.
        ba2.checkMyBalance(); // >> 0
         */

        check(ba);
    }

    /*
    만약 아래처럼 적었다면 check 메소드는 non-static 메소드였다.
    즉, 인스턴스 멤버필드/ 멤버메소드
    PassingRef pf = new PassingRef();
    pf.check(ba);

    1. void, return
    2. static, non-static( (주소값.)이 필요, 객체화해야 함)
     */

    public static void check(BankAccount ba) {
        ba.checkMyBalance();
    }

}
