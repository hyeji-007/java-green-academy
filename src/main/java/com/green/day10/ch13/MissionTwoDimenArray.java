package com.green.day10.ch13;

public class MissionTwoDimenArray {
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

    /*
    영수: 합계점수, 평균점수
    상철: 합계점수, 평균점수
    광수: 합계점수, 평균점수
    국어: 합계점수, 평균점수
    영어: 합계점수, 평균점수
    수학: 합계점수, 평균점수
    학급: 합계점수, 평균점수
     */



        int sum1 = 0;
        for(int i = 0; i < 1; i++) {
            for(int z = 0; z < score[0].length; z++) {
                sum1 += score[i][z];
            }
        }
        double average1 = sum1 / 3.0;
        System.out.println("영수 합계 점수: " + sum1);
        System.out.println("영수 평균 점수: " + average1);



        int sum2 = 0;
        for(int i = 1; i < 2; i++) {
            for(int z = 0; z < score[1].length; z++) {
                sum2 += score[i][z];
            }
        }
        double average2 = sum2 / 3.0;
        System.out.println("상철 합계 점수: " + sum2);
        System.out.println("상철 평균 점수: " + average2);

        int sum3 = 0;
        for(int i = 2; i < 3; i++) {
            for(int z = 0; z < score[2].length; z++) {
                sum3 += score[i][z];
            }
        }
        double average3 = sum3 / 3.0;
        System.out.println("광수 합계 점수: " + sum3);
        System.out.println("광수 평균 점수: " + average3);


        int sum4 = 0;
        for(int i = 0; i < 1 ; i++) {
            for(int z = 0; z < 3; z++) {
                sum4 += score[i][z];
            }
        }
        double average4 = sum4 / 3.0;
        System.out.println("국어 합계 점수: " + sum4);
        System.out.println("국어 평균 점수: " + average4);

        int sum5 = 0;
        for(int i = 1; i < 2 ; i++) {
            for(int z = 0; z < 3; z++) {
                sum5 += score[i][z];
            }
        }
        double average5 = sum5 / 3.0;
        System.out.println("영어 합계 점수: " + sum5);
        System.out.println("영어 평균 점수: " + average5);

        int sum6 = 0;
        for(int i = 2; i < 3 ; i++) {
            for(int z = 0; z < 3; z++) {
                sum5 += score[i][z];
            }
        }
        double average6 = sum6 / 3.0;
        System.out.println("수학 합계 점수: " + sum6);
        System.out.println("수학 평균 점수: " + average6);










        int totalSum = 0;
        double average = 0;
        for(int i = 0; i < score.length; i++) {
            for(int z = 0; z < score[i].length; z++) {
                totalSum += score[i][z];
            }
        }
        average = totalSum / 9.0;
        System.out.println("학급 합계 점수: " + totalSum);
        System.out.println("학급 합계 점수: " + average);






    }



}
