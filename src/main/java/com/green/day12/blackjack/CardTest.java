package com.green.day12.blackjack;

import java.util.List;

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

class CardTest2 {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Card c1 = cd.draw();
        Gamer gamer = new Gamer();
        gamer.receiveCard(c1);
        gamer.receiveCard(cd.draw());
        gamer.receiveCard(cd.draw());
        gamer.showYourCards();

        List<Card> list = gamer.openCards();


    }
}

class CardTest3 {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Dealer dealer = new Dealer();
        dealer.receiveCard(cd.draw());
        dealer.receiveCard(cd.draw());
        dealer.receiveCard(cd.draw());
        dealer.showYourCards();
    }
}
