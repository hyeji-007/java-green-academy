package com.green.practice.day07_2.ch10;

public class ClassVarAccess {
    public static void main(String[] args) {
        AccessWay aw = new AccessWay();
        aw.increaseCnt();
        aw.num++;
        AccessWay.num++;
        System.out.printf("num: %d\n", AccessWay.num); //클래스명.static변수 or 메소드
        System.out.printf("num: %d\n", aw.num); // 권장 x
    }

}

class AccessWay {
    static int num = 0;

    AccessWay() {
        increaseCnt();
    }

    void increaseCnt() {
        num++;
    }
}
