package com.green.day02.ch04;

public class SDE {

    public static void main(String[] args) {

        /*
        && 연산자는 false 가 될 확률이 높은 연산을 왼쪽으로 배치하는 게 유리
        || 연산자는 true가 될 확률이 높은 연산을 왼쪽으로 배치하는 게 유리
         */

        int n1 = 0, n2 = 0;
        boolean result;

        result = ( (n1 += 10) < 0) && ( (n2 += 10) > 0 ); //flase
        System.out.println("result: " + result);
        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2);
        //n1 += 10 >> n1 = n1 + 10 >> n1 = 0 + 10 >> n1 = 10
        //n1 < 0: false이기 때문에 ((n2 += 10) > 0 ) 이 실행되지 않는다.
        // && 연산자는 왼쪽행이 false이면 오른쪽항 연산을 하지 않고 false를 리턴한다.

        int n3 = 0, n4 = 0;
        result = ( (n3 += 10) > 0) || ((n4 += 10) > 0); //true
        System.out.println("result: " + result);
        System.out.println("n3: " + n3);
        System.out.println("n4: " + n4);

    }
}
