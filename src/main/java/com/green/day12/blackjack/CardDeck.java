package com.green.day12.blackjack;

import java.util.Arrays;
import java.util.List;

public class CardDeck {
    //Card 객체 주소값 52개를 저장할 수 있어야 한다.
    private final Card[] cards; //cards의 <주소값만> 못 바꾼다. 각 방의 값은 바꿀 수 있다.
    private final String[] patterns;
    private int selectedIdx = 0; //외부에 줘야할 카드의 index값

    public CardDeck() {
        /*
        Card c = null; //지역 변수는 사용하기 전에 초기화해주어야 한다. 객체화가 된 애들은 기본적은로 default값을 갖는다.
        c.getPattern();
         */
        cards = new Card[52];
        patterns = new String[]{ "Diamond", "Heart", "Clova", "Spade" };

        //미션1
        // "", "" 값을 가지고 있는 Card객체를 52개를 만들고 cards배열에 하나씩 넣어라


        int idx = 0;
        for(int i = 0; i < patterns.length; i++) { //0, 1, 2, 3 >> 총 4번 실행
            String pattern = patterns[i];
            for(int z = 1; z <= 13; z++) { // 1~13 >> 총 52번 실행
                String denomination = getDenomination(z);
                cards[idx++] = new Card(pattern, denomination); //Card 객체 생성
                //cards[idx++] = new Card(Patterns[i], getDenomination(z));
            }
        }

        //섞어주세요 (랜덤, 스와핑)
        shuffle();

        /*
        for(int i = 0; i < cards.length; i++) {
            int ridx = (int)(Math.random() * cards.length);

            Card temp = cards[i];
            cards[i] = cards[ridx];
            cards[ridx] = temp;
        }

         */


        /*
        card 객체 주소값 출력
         for (Card card : cards) {
            System.out.println(card);
        }
         */

    }



    // 주소값 하나씩 리턴, 리턴 주소값 지워야하고 selectedIdx 이용하여 해결
    public Card draw() { //스와핑이랑 비슷함

        if(selectedIdx == 52) {
            return null;
        }
        Card tmp = cards[selectedIdx];
        cards[selectedIdx]  = null;
        selectedIdx++; //카드를 빼낼 자리: selectedIdx
        return tmp; //마지막으로 던짐
    }

    public void checkCards() {
        for (Card c : cards) {
            System.out.println(c);
        }
    }


//    public Card draw() {
//        Card card = cards[selectedIdx];
//        cards[selectedIdx] = null;
//            selectedIdx++;
//            return card;
//        }
//    }






    private void shuffle() {
        for(int i = 0; i < cards.length; i++) {
            int rIdx = (int)(Math.random() * cards.length); //0 ~ 51
            Card tmp = cards[i];
            cards[i] = cards[rIdx];
            cards[rIdx] = tmp;
        }
    }

    //n: 1 > "A"
    //n: 2~10 > 그대로 문자열로 만들어서 2 > "2", 3 > "3", 10 > "10"
    //n:11 > "J"
    //n:12 > "Q"
    //n:13 > "K"
    //나머지값 > ""
    public String getDenomination(int n) {
        if(n < 1 || n > 13) {
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

    public String[] getPatterns() {
        return patterns;
    }

    /*
    public String getDenomination(int n) {
        if (n == 1) {
            return "A";
        } else if (n == 11) {
            return "J";
        } else if (n == 12) {
            return "Q";
        } else if (n == 13) {
            return "K";
        } else if (2 <= n && n <= 10) {
            return String.valueOf(n);
        } else {
            return "";
        }
    }

     */

}

