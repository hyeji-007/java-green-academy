package com.green.day03.ch05;

public class MissionForInFor3_1 {

    public static void main(String[] args) {

        int star = (int)(Math.random() * 6 + 3.0);
        System.out.println(star);



        int len = star * star;
        for (int i = 1; i <= len; i++) {
                System.out.print("*");
                if (i % star == 0) { //나머지가 0일 때 개행
                    System.out.println(); //n의 배수일 때마다 개행
                }
            }




        }

        

















}
