package com.green.practice.day12.blackjack;

public class CardDeck2 {
    private final Card[] cards;
    private final String[] patterns;
    private int selectedIdx = 0;

    public CardDeck2() {
        cards = new Card[52];
        patterns = new String[] {"Diamond", "Heart", "Clova", "Spade"};

        //모두 다른값을 가지고 있는 Card객체 만들어서 cards에 순차적으로 넣어주세요.
        int idx = 0;
        for(int i = 0; i < patterns.length; i++) {
            String pattern = patterns[i];
            for(int z = 1; z <= 13; z++) {
                String denomination = getDenomination(z);
                cards[idx++] = new Card(pattern, denomination);
            }
        }


        shuffle();
    }

    private void shuffle() {
        for(int i = 0; i < cards.length; i++) {
            int rIdx = (int)(Math.random() * cards.length);
            Card tmp = cards[i];
            cards[i] = cards[rIdx];
            cards[rIdx] = tmp;

        }
    }

    public Card draw() {
        if (selectedIdx == 52) {
            return null;
        }
        Card tmp = cards[selectedIdx];
        cards[selectedIdx] = null;
        selectedIdx++;
        return tmp;

    }

    public void checkCards() {
        for (Card c : cards) {
            System.out.println(c);
        }
    }


    public String getDenomination(int n) {
        if(n < 1 || n > 13) {
            return "";
        }
        switch(n) {
            case 1: return "A";
            case 11: return "J";
            case 12: return "Q";
            case 13: return "K";
            default: return String.valueOf(n);
        }
    }
}

