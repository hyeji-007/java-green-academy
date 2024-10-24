package com.green.day12.blackjack;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck(); //CardDeck객체의 주소값이 cd에 담긴다.
        cd.checkCards();
        System.out.println("-----------------");

        Card c = cd.draw(); //Card 객체의 주소값인 cd.draw()
        //Card c2 = cd.draw(); //Card 객체의 주소값인 cd.draw()
        System.out.println(c);
        System.out.println("-----------------");
        cd.checkCards();



    }
}
