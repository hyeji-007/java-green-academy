package com.green.practice.day11.ch14;

public class SuperSubStatic {

    public static void main(String[] args) {
        SuperCLS s1 = new SuperCLS();
        SuperCLS s2 = new SuperCLS();
        SubCLS sub1 = new SubCLS();
        sub1.showCount();
    }
}

class SuperCLS {
    protected static int count; //공용으로 쓰는 static 멤버필드

    SuperCLS() {
        count++;
    }

}

class SubCLS extends SuperCLS {
    SubCLS() {
        super();
    }
    void showCount() {
        System.out.println("count: " + count);
    }
}
