package com.green.day02.ch05;

import org.w3c.dom.ls.LSOutput;

public class MissionIf {
    /*
    아래 코드에서는 두 개의 if 문을 사용하고 있다.
    이를 하나의 if문만 사용하도록 변경해보자.
     */
    public static void main(String[] args) {
        int n = 120;

        if (n > 0) {
            if ( (n % 2) == 0 ) {
                System.out.printf("%d는 양수이면서 짝수이다.\n", n);
            }
        }
        System.out.println("--끝--");

        if ((n > 0) && (n % 2) == 0) {
                System.out.printf("%d는 양수이면서 짝수이다.\n", n);
            }
    }
}
