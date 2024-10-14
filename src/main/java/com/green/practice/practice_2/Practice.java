package com.green.practice.practice_2;

public class Practice {
    public static void main(String[] args) {
               /*
        1번.
        구구단의 짝수 단인 2, 4, 6, 8단만 출력하는 프로그램을 작성하되
        2단은 2 x 2까지,
        4단은 4 x 4까지,
        6단은 6 x 6까지,
        8단은 8 x 8까지
        출력하도록 작성하자.
         */

        for (int x=2; x<=8; x+=2){
            for (int y=1; y<10; y++){
                System.out.printf("%d x %d = %d\n", x , y , (x*y));
            }
            System.out.println();
        }
    }

}
