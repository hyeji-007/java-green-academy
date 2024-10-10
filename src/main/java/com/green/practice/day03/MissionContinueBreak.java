package com.green.practice.day03;

public class MissionContinueBreak {

    public static void main(String[] args) {

        //홀수끼리 계속 더했을 때 몇 번째에 1000을 넘는지, 그리고 그 값은 뭔지 구해라

        int sum = 0;
        int count = 0;

        for (int i = 1; ; i++) {
            if ( (i % 2) == 1 ) {
                count++;
                sum += i;
            }
            if (sum > 1000) {
                break;
            }
        }
        System.out.println("sum: " + sum);
        System.out.println("count: " + count);




    }
}
