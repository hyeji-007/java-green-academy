package com.green.practice.day11.ch16;

public class OverridingToString {

    public static void main(String[] args) {
        Cake c = new Cake();
        System.out.println(c);
        CheeseCake cheeseCake = new CheeseCake();
        System.out.println(cheeseCake);

        Cake c2 = cheeseCake;
        System.out.println(c2);
    }
}

class Cake extends Object {
    @Override
    public String toString() {
        return "My birthday Cake";
    }

    final void blowCandle() {
        System.out.println("초를 분다.");
    }
}

//class 앞에 final 키워드가 있으면 상속 금지
//대표적으로 String 클래스는 상속 불가능
final class CheeseCake extends Cake {
    @Override
    public String toString() {
        return "my birthday cheese cake";
    }

    /*
    - 자식에서 blowCandle 오버라이딩을 할 수 없다.
    왜? 부모메소드에 final 키워드가 있기 때문
     */
}
