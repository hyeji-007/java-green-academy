package com.green.practice.day11.ch16;

public class OverridingEquals {
    public static void main(String[] args) {

        String s1 = new String("10");
        String s2 = new String("10");

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1.equals(s2): " + s1.equals(s2));

        NumBox n1 = new NumBox(10);
        NumBox n2 = new NumBox(10);

        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2);

        System.out.println("n1 == n2: " + (n1 == n2));
        System.out.println("n1.equals(n2): " + n1.equals(n2));

    }
}

class NumBox {
    private int num;

    NumBox(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof NumBox) { // 타입과 동일한 객체이거나 자식 객체
            return (num == ((NumBox)object).num);
        }
        return false;
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }

}
