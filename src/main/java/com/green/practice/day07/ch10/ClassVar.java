package com.green.practice.day07.ch10;

public class ClassVar {
    public static void main(String[] args) {
        //InstCnt.instNum = 10;
        InstCnt ic1 = new InstCnt();
        //InstCnt.instNum = 5;
        InstCnt ic2 = new InstCnt();
        InstCnt ic3 = new InstCnt();
    }
}

class InstCnt {
    static int instNum; //static 변수: 클래스에서 하나만 존재
    int value; //일반 instance 변수: 각 객체마다 개별적으로 존재
    InstCnt() { //기본 생성자 (default constructor)
        instNum ++; //모든 객체가 공유하는 static 변수, 생성될 때마다 증가
        value++; //각 객체마다 별도로 존재하는 인스턴스 변수, 객체 생성 시마다 증가
        //System.out.println("인스턴스 생성: " + InstCnt.instNum);
        System.out.println("인스턴스 생성: " + instNum);
        System.out.println("value " + value);
    }

    /*
    1.static 변수: 클래스 레벨에서 관리되는 변수, 단 1번만 메모리에 할당되고
                   그 이후에는 클래스의 모든 객체들이 공유해서 사용하는 변수
                   -> 객체가 몇 개가 생성되든 간에 static 변수는 단 하나만 존재함.
    2. instance 변수: 각 객체마다 별도로 할당되는 변수
                   -> 객체가 생성될 때마다 새로운 메모리 공간이 할당되어 해당 객체만의 변수가 됨
     */


}
