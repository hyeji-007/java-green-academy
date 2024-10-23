package com.green.day11.ch14;

public class SuperSubStatic {

    public static void main(String[] args) {
        SuperCLS s1 = new SuperCLS();
        SuperCLS s2 = new SuperCLS();
        SubCLS sub1 = new SubCLS(); //SuperCLS() 부모 기본생성자를 자동으로 호출
        sub1.showCount();
    }
}

class SuperCLS { //class 앞에 public 붙일 수 있는 경우는 파일명=클래스명인 경우 딱 하나임(1 파일, 1 클래스, 1 public)
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


