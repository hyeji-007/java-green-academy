package com.green.practice.day03;

public class InfinityLoop {

    public static void main(String[] args) {

        int n = 1;

        while(true) {
            if( (n%6)==0 && (n%14)==0) {
                break;
            }
            n++;
        }
        System.out.println("n: " + n);
    }
}
