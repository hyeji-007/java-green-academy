package com.green.day02.ch05;

public class MissionIf4 {

    public static void main(String[] args) {

        int score = (int)(Math.random() * 101.0);
        System.out.printf("score: %d\n", score);

        if (score >= 98) {
            System.out.printf("score: %d , %c\n", score);
        } else if (score >= 94) {
            System.out.printf("score: %d , A0\n", score);
        } else if (score >= 90) {
            System.out.printf("score: %d , A-\n", score);
        } else if (score >= 88) {
            System.out.printf("score: %d , B+\n", score);
        } else if (score >= 84) {
            System.out.printf("score: %d , B0\n", score);
        } else if (score >= 80) {
            System.out.printf("score: %d , B-\n", score);
        } else if (score >= 76) {
            System.out.printf("score: %d , C+\n", score);
        } else if (score >= 74) {
            System.out.printf("score: %d , C\n", score);
        } else {
            System.out.printf("score: %d , C-\n", score);
        }















    }
}
