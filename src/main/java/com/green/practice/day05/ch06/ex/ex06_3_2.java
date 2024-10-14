package com.green.practice.day05.ch06.ex;

public class ex06_3_2 {

    public static void main(String[] args) {
        toBinary(10);
    }

    static void toBinary(int decimal) {
        if(decimal > 0) {
            int bin = decimal % 2;
            decimal /= 2;

            toBinary(decimal);
            System.out.print(bin);

        }
    }




}
