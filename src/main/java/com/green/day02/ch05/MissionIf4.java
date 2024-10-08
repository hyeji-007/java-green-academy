package com.green.day02.ch05;

public class MissionIf4 {

    public static void main(String[] args) {

        int score = (int)(Math.random() * 101.0);
        System.out.printf("score: %d\n", score);

        String grade = "D", opt = "";
        int gradeScore = score / 10; //10의 자리 숫자

        switch(gradeScore) {
            case 9, 10:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
        }

        int optScore = score % 10; //1의 자리 숫자

        if (gradeScore > 6) {
            if (optScore >= 8 || score == 100) {
                opt = "+";
            } else if (optScore >= 4) {
                opt = "0";
            } else {
                opt = "-";
            }
        }
        System.out.printf("%s%s\n", grade, opt);











        /*
        if (score >= 98) {
            System.out.printf("score: %d , A+\n", score);
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
        } else if (score >= 78) {
            System.out.printf("score: %d , C+\n", score);
        } else if (score >= 74) {
            System.out.printf("score: %d , C0\n", score);
        } else if (score >= 70) {
            System.out.printf("score: %d , C-\n", score);
        } else {
            System.out.printf("score: %d , D\n", score);
        }
        */

        /*
        char grade = 'D', opt = '0';

        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                    opt = '+';
                } else if (score < 84) {
                    opt = '-';
                }
        } else if (score >= 70) {
            grade = 'C';
            if (score >= 78) {
                opt = '+';
            } else if (score < 74) {
                opt = '-';
            }
        } else {
            opt = ' ';
        }
        System.out.printf("%c%c\n", grade, opt);
        */














    }
}
