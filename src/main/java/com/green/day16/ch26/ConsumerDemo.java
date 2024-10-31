package com.green.day16.ch26;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> cons = v -> System.out.println(v < 0 ? -v : v);

        /*
        Consumer<Integer> cons = v -> {
            if(v < 0) {
                v *= -1;
            } else {
                v = v;
            }
            System.out.println(v);
        };
         */


        cons.accept(10); //콜솔에 "10"
        cons.accept(-20); //콜솔에 "20"
        cons.accept(-20); //콜솔에 "20"

        /*
        Consumer<String> cons2 = s ->  {
            System.out.println(s.length());
            };

         */

        Consumer<String> cons2 = str -> System.out.printf("%s는(은) %d글자입니다.\n", str, str.length());

        cons2.accept("abc");
        cons2.accept("dddd");
    }
}
