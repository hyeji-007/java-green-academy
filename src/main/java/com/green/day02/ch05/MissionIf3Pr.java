package com.green.day02.ch05;

import java.util.Scanner;

public class MissionIf3Pr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 하나 입력하세요 >> ");
        int input = scanner.nextInt();
        System.out.printf("input: %d\n", input);

        //11는(은) 홀수입니다.
        //14는(은) 짝수입니다.

        if (input % 2 == 1) {
            System.out.printf("%d는 홀수입니다.\n", input);
        } else {
            System.out.printf("%d는 짝수입니다.\n", input);
        }
        System.out.println("--끝--");

        char result1 = (input % 2 == 0) ? '짝' : '홀';
        System.out.printf("%d는(은) %c수 입니다.\n", input, result1);

        String result2 = (input % 2 == 0) ? "짝" : "홀";
        System.out.printf("%s는(은) %s수 입니다.\n", input, result2);

    }
}
