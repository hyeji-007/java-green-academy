package com.green.day16.ch26;

public class Lambda1 {
    public static void main(String[] args) {
        //파라미터가 하나일 경우 () 소괄호 생략 가능
        //s : 파라미터가 하나, (s)도 가능 //세미클콘이 하나일 경우 중괄호 생략 가능하다.{};
        PrintableVer2 p = s -> System.out.println(s);
        p.print("하하2");

        //중괄호 생략시 return도 생략 가능 (중괄호 생략시 return 키워드 작성 불가, 중괄호와 return은 세트이다)
        //(n1, n2) : 파라미터가 두개, 소괄호 생략 불가
        Calc sumCalc = (n1, n2) -> n1 + n2;
        System.out.println(sumCalc.calc(5, 8));
        System.out.println(sumCalc.calc(2, 3));

        Calc minusCalc = (n1, n2) -> { return n1 - n2; };
        System.out.println(minusCalc.calc(10, 7));
        System.out.println(minusCalc.calc(100, 13));
    }

}

@FunctionalInterface
interface Calc {
    int calc(int n1, int n2);
}
@FunctionalInterface //추상 메소드를 하나만 가질 수 있다는 것을 알려줌(추상 메소드를 하나 더 만드는 순간 Error) >> 람다식을 사용하고 싶을 때 사용
interface PrintableVer2 {
    void print(String str); //파라미터가 있고 리턴 타입이 void: Java api 중 consumer이 있다.
    //파라미터도 있고 리턴 타입도 있는 것은 function이라고 한다.

}

