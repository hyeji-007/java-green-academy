package com.green.day12.blackjack;

public class Card {
    private final String pattern; //무늬
    private final String denomination; //A, 2~10, J, Q, K 값 저장
    //private에 값 넣는 방법: 생성자, setter
    //                 빼는 방법: getter


    public Card (final String pattern, final String denomination) {
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