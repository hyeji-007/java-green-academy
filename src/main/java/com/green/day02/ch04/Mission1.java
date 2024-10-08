package com.green.day02.ch04;

public class Mission1 {

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 3;

        float result = n1/ n2; //int / int 결과타입도 int이기 때문에 실수값이 날아간 3이 float에 저장된 것
        System.out.println(result);

        float result2 = (float)n1/n2; // float / int >> float / float >> 결과 타입도 float이다.
        System.out.println("result2: " + result2);

        System.out.printf("%d / %d = %f\n", n1, n2, (float)n1/n2);


        System.out.println("n1 / n2 = " + (double)n1/n2);
    }
}
