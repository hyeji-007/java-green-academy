package com.green.practice.day10.ch13;

public class MissionTwoDimenArrayResult {
    public static void main(String[] args) {
        int[][] score = {
                //국어, 영어, 수학
                {100, 90, 80}, //영수
                {90, 90, 80}, //상철
                {80, 70, 60} //광수
        };

        String[] names = {"영수", "상철", "광수"};
        int[] namesScore = new int[names.length];

        String[] subjects = {"국어", "영어", "수학"};
        int[] subjectsScore = new int[subjects.length];

        //각 이름별, 과목별 합계값 구하는 부분
        int totalScore = 0;
        for(int i = 0; i < score.length; i++) {
            for(int z = 0; z < score[i].length; z++) {
                totalScore += score[i][z];
                namesScore[i] += score[i][z]; //학생별 합계 점수 정리
                subjectsScore[z] += score[i][z]; //과목별 합계 점수 정리
            }
        }

        //학생 별 합계점수, 평균점수 출력
        for(int i = 0; i < names.length; i++) {
            System.out.printf("%s: 합계점수: %d, 평균점수: %.1f\n", names[i], namesScore[i], (float)namesScore[i] / subjects.length);
        }
        System.out.println("---------------------");
        //과목 별 합계점수, 평균점수
        for(int i = 0; i < subjects.length; i++) {
            System.out.printf("%s: 합계점수: %d, 평균점수: %.1f\n", subjects[i], subjectsScore[i], (float)subjectsScore[i] / names.length);
        }
        System.out.println("---------------------");
        System.out.printf("학급: 합계점수: %d, 평균점수: %.1f\n", totalScore, (float)totalScore / (names.length * subjects.length));
    }
}
