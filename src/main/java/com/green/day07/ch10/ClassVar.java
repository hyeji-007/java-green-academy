package com.green.day07.ch10;

public class ClassVar { //static

    public static void main(String[] args) {
        InstCnt.instNum = 10;
        InstCnt ic1 = new InstCnt();
        InstCnt.instNum = 5;
        InstCnt ic2 = new InstCnt();
        InstCnt ic3 = new InstCnt();
    }
}

class InstCnt {
    static int instNum; //static 변수: 클래스에서 하나만 존재
    int value; //일반 인스턴스 변수, 각 객체마다 개별적으로 존재
    InstCnt() { //기본 생성자 (default constructor)
        instNum++; //모든 객체가 공유하는 static 변수(instNum), 생성될 때마다 증가
        value++; //각 객체마다 별도로 존재하는 인스턴스 변수, 객체 생성 시마다 증가
        System.out.println("인스턴스 생성: " + InstCnt.instNum);
        System.out.println("인스턴트 생성: " + instNum);
        System.out.println("value: " + value);
    }

        /*
        1.static 변수: 프로그램이 시작될 때 <한 번 메모리에 할당됨>
        그 이후에는 어떤 객체가 생성되든 모든 객체가 동일한 instNum(static 변수)을 공유함
        new instCnt()가 실행될 때마다 instNum++이 실행되므로, instNum 값은 <공유되는 하나의 값으로
        계속 증가함>
        -> 클래스 차원에서 <하나만 존재>하며 모든 인스턴스에서 <공유>됨

        2.인스턴스 변수: InstCnt 객체가 생성될 때마다 value는 그 객체에 독립적으로 할당됨
        그래서 new InstCnt()를 실행할 때마다 <각 객체마다 새로운 메몸리 공간에 value가 할당됨>
        각 객체의 value는 따로 관리되기 때문에, 한 객체에서의 변경은 다른 객체에 영향 x
        -> 객체마다 <개별적으로 생성>되며 각 객체는 자신만의 value값을 가짐
         */



        /*
        1.static 변수: 클래스 레벨에서 관리되는 변수, 단 1번만 메모리에 할당되고 그 이후에는 클래스의 모든 객체들이 공유해서 사용하는 변수
        -> 객체가 몇 개가 생성되든 간에 static 변수는 단 하나만 존재함.
        2. 인스턴스 변수: 각 객체마다 별도로 할당되는 변수
        -> 객체가 생성될 때마다 새로운 메모리 공간이 할당되어 해당 객체만의 변수가 됨
         */



}
