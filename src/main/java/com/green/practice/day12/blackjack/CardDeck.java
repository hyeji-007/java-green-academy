package com.green.practice.day12.blackjack;

public class CardDeck {
    //Card 객체 주소값 52개를 저장할 수 있어야 한다.
    private final Card[] cards;
    private final String[] patterns;
    private int selectedIdx = 0;

    public CardDeck() {
        cards = new Card[52];
        patterns = new String[] { "Diamond", "Heart", "Clova", "Spade" };

        int idx = 0;
        for(int i = 0; i < patterns.length; i++) {
            String pattern = patterns[i];
            for(int z = 1; z <= 13; z++) {
                String denomination = getDenomination(z);
                cards[idx]
            }
        }

    }

    public String[] getPatterns() {
        return patterns;
    }

    public String getDenomination(int n) {
        if (n < 1 || n > 13) {
            return "";
        }
        switch(n) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
            default:
                return String.valueOf(n);
        }
    }



}
