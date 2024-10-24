package com.green.practice.day12.blackjack;

public class Card_2 {
    private final String pattern;
    private final String denomination;

    public Card_2 (final String pattern, final String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getPattern() {
        return pattern;
    }

    public String getDenomination() {
        return denomination;
    }

    @Override
    public String toString() {
        return String.format("%s(%s)", pattern, denomination);
    }
}
