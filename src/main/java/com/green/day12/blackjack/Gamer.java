package com.green.day12.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
    //Card객체 주소값 여러개 저장할 수 있어야 합니다.
    //ArrayList 사용할거임
    //멤버필드 선언, 변수명은 cards

    protected final List<Card> cards;
    protected int point;

    //Gamer 생성자
    public Gamer() {
        cards = new ArrayList();
    }

    //카드를 받아서 cards 리스트에 추가하는 메서드
    public void receiveCard(Card c1) {
        //switch expression : 값을 리턴해준다.
        this.point += switch(c1.getDenomination()) {
            case "A" -> { yield 1; }
            case "J", "Q", "K" -> 10;
            default -> Integer.parseInt(c1.getDenomination());
        };

        String str = "10";
        int val = Integer.parseInt(str); //val 변수에 10 정수값이 주입된다.
        cards.add(c1);
    }

    public int getPoint() {
        return point;

    }

    //카드들을 출력하는 메서드
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

    //카드 리스트 반환 메서드
    public List<Card> openCards() {
        return cards;
    }


}
