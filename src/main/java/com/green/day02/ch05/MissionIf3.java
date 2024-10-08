package com.green.day02.ch05;

import java.util.Scanner;

public class MissionIf3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 하나 입력하세요 >> ");
        int input = scanner.nextInt();
        System.out.printf("input: %d\n", input);

        if (input % 2 == 0) {
            System.out.printf("%d는 짝수입니다.\n ", input);
        } else {
            System.out.printf("%d는 홀수입니다.\n", input);
        }

        char result1 = (input % 2 == 0 ? '짝' : '홀'); // 결과값은 char type
        System.out.printf("%d는 %c수입니다.\n", input, result1 );

        String result2 = (input % 2 == 0? "짝" : "홀"); // 결과값은 String type
        //대문자로 시작하는 건 (String) referance 변수, 8byte
        System.out.printf("%d는 %s수입니다.\n", input, result2 );


        System.out.println("--끝--");























    }
}
