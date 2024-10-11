package com.green.practice.practice;

public class Practice2 {

    public static void main(String[] args) {
        int star = (int) (Math.random() * 6.0) + 3;
        System.out.println(star);

        for(int i = star; i > 0; i--) {
            for(int z = 0; z <= star; z++) {
                System.out.print(z < i ? " " : "*");
            }
            System.out.println();
        }


        /*
        for (int n = star; n > 0; n--) {
            for (int i = 0; i > n; i++) {
                System.out.print(" ");
            }
            for (int i = star; i > star-i; i--) {
                System.out.print("*");
            }
            System.out.println();
            */







       /* for(int i=star;i>0;i--){
            for (int z=0;z>i;z++){
                System.out.print("*");
            }

        */




    }






}

