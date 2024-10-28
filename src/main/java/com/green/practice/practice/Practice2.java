package com.green.practice.practice;

public class Practice2 {

    public static void main(String[] args) {
        int star = (int) (Math.random() * 6.0) + 3;
        System.out.println(star);

        for(int i = 1; i <= star; i++) {
            for(int z = 1; z <= star; z++) {
                System.out.print(z < i ? "_" : "*" );
            }
            System.out.println();
        }
        System.out.println("-1-----------");

        for(int i = 1; i <= star; i++) {
            for(int z = 1; z <= star; z++) {
                if(z <= i) {
                    System.out.print("*");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
        System.out.println("-2-----------");

        for(int i = star; i > 0; i--) {
            for(int z = 1; z <= star; z++) {
                if(z <= i) {
                    System.out.print("*");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }

        System.out.println("-3-----------");

        for(int i = star; i > 0; i--) {
            for(int z = 1; z <= star; z++) {
                System.out.print(z >= i ? "*" : "_" );
            }
            System.out.println();
        }
        System.out.println("-4-----------");

        for(int i = 0; i < star; i++) {
            for(int z = 0; z < i; z++) {
                System.out.print("_");
            }
            for(int z = 0; z < (star-i); z++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-5-----------");

        for(int i = 1; i <= star; i++) {
            for(int z = 1; z <= star; z++) {
                if (z < i) {
                    System.out.print("_");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println("-6-----------");

        for(int i = 1; i <= star; i++) {
            for(int z = 1; z <= star; z++) {
                System.out.print(z <= i ? "*" : "_");
            }
            System.out.println();
        }
        System.out.println("-7-----------");

        for(int i = star; i >= 1; i--) {
            for(int z = 1; z <= star; z++) {
                if(z <= i) {
                    System.out.print("*");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
        System.out.println("-8-----------");

        for(int i = star; i >= 1; i--) {
            for(int z = 1; z <= star; z++) {
                System.out.print(z < i ? "_" : "*");
            }
            System.out.println();
        }
        System.out.println("-9-----------");

        for(int i = 1; i <= star; i++) {
            for(int z = 1; z <= star; z++) {
                System.out.print(z <= i ? "*" : "_");
            }
            System.out.println();
        }
        System.out.println("-10-----------");

        for(int i = 1; i <= star; i++) {
            for(int z = 1; z <= star; z++) {
                System.out.print(z < i ? "_" : "*");
            }
            System.out.println();
        }
        System.out.println("-11-----------");

        for(int i = star; i >= 1; i--) {
            for(int z = 1; z <= star; z++) {
                System.out.print(z > i ? "_" : "*");
            }
            System.out.println();
        }
        System.out.println("-12-----------");

        for(int i = star; i >= 1; i--) {
            for(int z = 1; z <= star; z++) {
                System.out.print(z < i ? "_" : "*");
            }
            System.out.println();
        }
        System.out.println("-13-----------");



    }
}

