package com.green.day02.ch05;

public class IEBasic {

    public static void main(String[] args) {
        // if문, 분기문 >>  갈림길을 만들 수 있다.
        // 이럴 때 이렇게, 저럴 때 저렇게 실행이 되었으면 할 때
        int n1 = 5, n2 = 5;

        if(n1 < n2) { //if(true)가 되었을 때만 {} 사이에 있는 코드들이 실행이 된다.
            System.out.printf("%d < %d is %b\n", n1, n2, (n1 < n2));
        }

        /*
        if(n1 > n2) { //if(false)가 되었을 때는 코드들이 실행이 안 된다.
            System.out.println("%d > %d is %b\n" n1, n2, (n1 > n2));
        }
        */

        //if-else문은 둘 중 하나만 실행이 된다.
        //if(true) if(){} 안의 내용이 실행이 되고,
        //if(false)면 else{} 안의 내용이 실행이 된다.
        if(n1 == n2) {
            System.out.printf("%d == %d is true\n", n1, n2);
        } else {
            System.out.printf("%d == %d is false\n", n1, n2);
        }

        System.out.println("--끝--");
    }
}
