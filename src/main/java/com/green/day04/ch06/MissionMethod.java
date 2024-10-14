package com.green.day04.ch06;

public class MissionMethod {
    public static void main(String[] args) {
        printStar(5);
        printStar(2);
        System.out.println("---------------");
        printStarSquare(4);
        printStarTriangle(4);
    }

    static void printStar(int star) {
        for(int i = 0; i < star; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    static void printStarSquare(int star) {
        for (int i = 1; i <= star; i++) {
            printStar(star);
        }
        System.out.println();
    }

    static void printStarTriangle(int star) {
        for(int i = 1; i <= star; i++) {
            printStar(i);
        }

    /*
    static void printStarTriangle(int star) {
        for(int i = 1; i <= star; i++) {
            for(int z = 1; z <= i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    */

    }
}




