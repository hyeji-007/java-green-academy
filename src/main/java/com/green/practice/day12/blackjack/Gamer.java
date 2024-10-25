package com.green.practice.day12.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {

    protected final List<Card> cards;
    protected int point;

    public Gamer() {
        cards = new ArrayList<>();
    }

    public void receiveCard(Card c1) {
        this.point += switch(c1.getDenomination()) {
            case "A" -> {yield 1;}
            case "J", "Q", "K" -> 10;
            default -> Integer.parseInt(c1.getDenomination());
        };

        String str = "10";
        int val = Integer.parseInt(str);
        cards.add(c1);
    }

    public int getPoint() {
        return point;
    }

    public void showYourCards() {
        //receiveCard 메서드 호출
        System.out.println("--- receiveCard test ---");
        receiveCard(new Card("Diamond","7"));
        receiveCard(new Card("Heart","A"));
        receiveCard(new Card("Clova","K"));

        //각 카드 출력(세로로)
        for (int i = 0; i < cards.size(); i++) {
            Card item = cards.get(i);
            System.out.println(item);
        }

        System.out.println("----------------------------");

//        for (Card item : cards) {
//           System.out.println(item);
//        }
    }
}
