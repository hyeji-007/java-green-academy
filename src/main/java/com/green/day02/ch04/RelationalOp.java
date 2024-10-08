package com.green.day02.ch04;

public class RelationalOp {

    public static void main(String[] args) {
        /*
        관계연산자 >> 결과 type: boolean(true/false)
         */

        int n1 = 3, n2 = 2, n3 = 7;
        //float n4 = 7.0d >> foat이 더 작아서 x
        float n4 = 7.0F; //리터럴 실수는 double타입이기 때문에 float타입의 실수를 사용하고 싶으면 끝이 f, F를 붙여주어야 한다.
        //float n7 = n5; >> n5는 double 타입이라서 x
        double n5 = 7.0;
        double n6 = 7.0f; //>> double이 더 커서 o

        //n4, n7은 같은 이유로 자동 형변환이 되지 않는다.
        //대신 명시적 형변환(강제 형변환)은 가능하다.

        //리터럴 실수 뒤에 d, 0을 붙여도 상관없다. 7.0, 7.0d, 7.00 전부 double 타입
        System.out.printf("%d >= %d : %b\n", n1, n2, (n1 >= n2));
        System.out.printf("%d <= %d : %b\n", n1, n2, (n1 <= n2));
        System.out.printf("%f == %d : %b\n", n5, n3, (n5 == n3));  //정수가 실수로
        System.out.printf("%f != %d : %b\n", n5, n3, (n5 != n3));

    }
}
