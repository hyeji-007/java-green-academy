package com.green.day15.ch18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("a/b ... a?");
            int n1 = scan.nextInt();
            System.out.print("a/b ... b?");
            int n2 = scan.nextInt();

            System.out.printf("%d / %d = %d\n", n1, n2, (n1 / n2));
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) { //Exception은 항상 가장 아래 catch문에 적을 수 있다.
            e.printStackTrace();
            e.getMessage();
        }

        System.out.println("--------------------------(2)");

        try {
            System.out.print("a/b ... a?");
            int n1 = scan.nextInt();
            System.out.print("a/b ... b?");
            int n2 = scan.nextInt();

            System.out.printf("%d / %d = %d\n", n1, n2, (n1 / n2));
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("--------------------------(3)");

        try {
            System.out.print("a/b ... a?");
            int n1 = scan.nextInt();
            System.out.print("a/b ... b?");
            int n2 = scan.nextInt();

            System.out.printf("%d / %d = %d\n", n1, n2, (n1 / n2));
        } catch (Exception e) { //모든 예외를 다 잡는다. <예외의 최상위 class>, 예외 최상위 부모 (if 문에서 else, switch문에서 default)
            //항상 제일 아래에 적는다. 마지막으로 남은 예외를 모두 잡는 것이기에.
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("-- 종료 --");
        //System.out.printf("%d / \n", n1); //스코프가 안 맞아서 n1 에러 뜸

    }
}
