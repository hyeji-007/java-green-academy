package com.green.practice.day04.ch05;

public class MissionForInFor5_2 {

    public static void main(String[] args) {
        int star = (int)(Math.random() * 6.0) + 3;
        System.out.println("star: " + star);

        for(int i = 1; i <= star; i++) {
            for(int z = star; z > i; z--) {
                System.out.print("_");
            }
            for(int z = 0; z < i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("1--------------------------------------");

        for(int i = star; i > 0; i--) {
            for(int z = 1; z <= star; z++) {
                System.out.print(z < i ? "_" : "*");
            }
            System.out.println();
        }
        System.out.println("2--------------------------------------");

        for(int i = 0; i < star; i++) {
            for(int z = 1; z <= star; z++) {
                System.out.print(z > i ? "*" : "_");
            }
            System.out.println();
        }
        System.out.println("3--------------------------------------");

        for(int i = 0; i < star; i++) {
            for(int z = 1; z <= star; z++) {
                if(z < (star-i)) {
                    System.out.print("_");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println("8--------------------------------------");




        for(int i = 0; i < star; i++) {
            for(int z = 1; z <= star; z++) {
                if(z >= (star-i)) {
                    System.out.print("*");
                }else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
        System.out.println("4--------------------------------------");

        for(int i = 1; i <= star; i++) {
            for(int z = 0; z < star; z++) {
                if(z >= (star-i)) {
                    System.out.print("*");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
        System.out.println("5--------------------------------------");

        for(int i = 1; i <= star; i++) {
            for(int j = 0; j < (star-i); j++) {
                System.out.print("_");
            }
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("6--------------------------------------");

        for(int i = 0; i < star; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("_");
            }
            for(int j = 0; j < (star-i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 1; i <= star; i++) {
            for(int z = 0; z < i; z++) {
                System.out.print("*");
            }
            for(int z = 0; z < (star-i); z++) {
                System.out.print("_");
            }
            System.out.println();
        }

        for(int i = 1; i <= star; i++) {
            for(int z = 0; z < star; z++) {
                if (z < i) {
                    System.out.print("*");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
        System.out.println();


        for(int i = 0; i < star; i++) {
            for(int z = 1; z <= star; z++) {
                if (z > i) {
                    System.out.print("*");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 0; i < star; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("_");
            }
            for(int j = 0; j < (star-i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 1; i <= star; i++) {
            for(int z = 1; z <= star; z++) {
                System.out.print(z < i ? "_" : "*");
            }
            System.out.println();
        }

        System.out.println("7--------------------------------------");

        for(int i = 0; i < star; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("_");
            }
            for(int j = 0; j < (star-i); j++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println();

        for(int i = star; i > 0; i--) {
            for(int z = 1; z <= star; z++) {
                System.out.print(z > i ? "_" : "*");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = star; i > 0; i--) {
            for(int j = 1; j <= star; j++){
                if(j < i) {
                    System.out.print("_");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 1; i <= star; i++) {
            for(int z = 1; z <= star; z++) {
                if(z < i) {
                    System.out.print("_");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 0; i < star; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("_");
            }
            for(int j = 0; j < (star-i); j++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println();

        for(int i = 1; i <= star; i++) {
            for(int z = star; z >= 1; z--) {
                if(z < i) {
                    System.out.print("_");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 1; i <= star; i++) {
            for(int z = star; z >= 1; z--) {
                System.out.print(z < i ? "_" : "*");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 1; i <= star; i++) {
            for(int z = 1; z <= star; z++) {
                if(z < i) {
                    System.out.print("_");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 1; i <= star; i++) {
            for(int z = 1; z <= star; z++) {
                System.out.print(z < i ? "_" : "*");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 1; i <= star; i++) {
            for(int z = star; z >= 1; z--){
                if(z < i) {
                    System.out.print("_");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 1; i <= star; i++) {
            for(int z = star; z >= 1; z--) {
                System.out.print(z < i ? "_" : "*");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = star; i >= 1; i--) {
            for(int z = 1; z <= (star-i); z++) {
                System.out.print("_");
            }
            for(int z = 1; z <= i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 1; i <= star; i++) {
            for(int z = i; z <= star; z++) {
                if (z < i) {
                    System.out.print("_");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 0; i < star; i++) {
            for(int z = star; z > i; z--) {
                System.out.print("*");
            }
            for(int z = 0; z < i; z++) {
                System.out.print("_");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 1; i <= star; i++) {
            for(int z = star; z > 0; z--) {
                System.out.print(z < i ? "_" : "*");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 1; i <= star; i++) {
            for(int z = 1; z <= star; z++) {
                if(z < i) {
                    System.out.print("_");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


    }
}
