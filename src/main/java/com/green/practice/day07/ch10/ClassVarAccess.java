package com.green.practice.day07.ch10;

public class ClassVarAccess {
    public static void main(String[] args) {
        AccessWay aw = new AccessWay(); //0 >> 1
        aw.increaseCnt(); // 1 >> 2
        aw.num++; // 2 >> 3
        AccessWay.num++; //3 >> 4
        System.out.printf("num: %d\n", AccessWay.num);

    }
}

class AccessWay {
    static int num = 0;

    AccessWay() { //1.기본 생성자 호출
        increaseCnt(); //2. 메소드 호출
    }
    void increaseCnt() {
        num++; //3
    }
}
