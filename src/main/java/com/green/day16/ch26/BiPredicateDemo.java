package com.green.day16.ch26;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        //특정 문자열의 길이가 내가 정한 정수값 보다 크면 true, 아니면 false
        /*
        @FunctionalInterface >> 추상 메소드를 하나만 가질 수 있다는 것을 알려줌(추상 메소드를 하나 더 만드는 순간 Error)
        public interface BiPredicate<T, U> {}
         */
        BiPredicate<String, Integer> conv = (str, len) -> str.length() > len;

        System.out.println(conv.test("Robot", 3)); //true
        System.out.println(conv.test("Box", 5)); //false

        String str1 = "Hello";
        String str2 = "Halo1";

        BiPredicate<String, String> conv2 = (s1, s2) -> s1.length() == s2.length();

        if(conv2.test(str1, str2)) {
            System.out.println("두 문자열의 길이는 같습니다.");
        } else {
            System.out.println("두 문자열의 길이는 다릅니다.");
        }
    }
}
