package com.green.practice.day11.ch14;

public class SuperSubCon {
    public static void main(String[] args) {
        ClassC classC = new ClassC();
    }
}

//super 생성자 호출은 자식 생성자 코드에서 최상위에 위치해야 한다.
class ClassA {
    public ClassA() {
        super();
        System.out.println("==== ClassA ====");
    }
}

class ClassB extends ClassA {
    public ClassB() {
        super();
        System.out.println("==== ClassB ====");
    }
}

class ClassC extends ClassB {
    public ClassC() {
        super();
        System.out.println("==== ClassC ====");
    }
}