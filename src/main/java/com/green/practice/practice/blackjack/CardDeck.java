package com.green.practice.practice.blackjack;

import java.util.LinkedList;
import java.util.List;

public class CardDeck {
    private List<Card> cards;
    private static final String[] PATTERNS = {"spade", "heart", "diamond","club"};
    private static final int CARD_COUNT = 13;

    public Card getCard() {
        return null;
    }

    public CardDeck() {
        cards = this.generateCards();

    }

    private List<Card> generateCards() {
        List<Card> cards = new LinkedList<>();

        for(String pattern : PATTERNS) {
            for(int i = 1; i <= CARD_COUNT; i++) {
                String denomination = this.numberToDenomination(i);
                Card card = new Card(pattern, denomination);

                cards.add(card);
            }
        }
        return cards;
    }

    private String numberToDenomination(int number) {

        if(number==1) {
            return "A";
        } else if (number == 11) {
            return "J";
        } else if (number == 12) {
            return "Q";
        } else if (number == 13) {
            return "K";
        } else {
            return String.valueOf(number);
        }

    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for(Card card : cards) {
            sb.append(card.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
