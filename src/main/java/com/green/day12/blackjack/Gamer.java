package com.green.day12.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
    //Card객체 주소값 여러개 저장할 수 있어야 합니다.
    //ArrayList 사용할거임
    //멤버필드 선언, 변수명은 cards

    private final List<Card> cards;

    public Gamer() {
        cards = new ArrayList();
    }

    public void receiveCard(Card c1) {
        cards.add(c1);
    }

    public void showYourCards() {
        for (int i = 0; i < cards.size(); i++) {
            Card item = cards.get(i);
            System.out.println(item); //세로로 찍기
        }
        System.out.println("----------------------------");

        for (Card item : cards) {
           System.out.println(item);
        }
    }

    public List<Card> openCards() {
        return cards;
    }


}
