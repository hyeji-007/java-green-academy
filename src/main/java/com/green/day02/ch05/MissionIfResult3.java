package com.green.day02.ch05;

public class MissionIfResult3 {

    public static void main(String[] args) {
        int score = (int)(Math.random() * 101.0);
        System.out.printf("score: %d\n", score);

        String grade = "D", opt = "";
        int gradeScore = score / 10;

        switch (gradeScore) {
            case 9, 10: grade = "A"; break;
            case 8: grade = "B"; break;
            case 7: grade = "C"; break;
        }

        int optScore = score % 10;

        if (gradeScore > 6) {
            if (optScore >= 8 || optScore == 10) {opt = "+";}
            else if (optScore >= 4) {opt = "0";}
            else {opt = "-";}
        }

        System.out.printf("%s%s\n", grade, opt);










    }
}
