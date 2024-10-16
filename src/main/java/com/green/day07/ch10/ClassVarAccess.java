package com.green.day07.ch10;

public class ClassVarAccess {
    public static void main(String[] args) {
        AccessWay aw = new AccessWay(); //0 >> 1
        aw.increaseCnt(); //1 >> 2
        aw.num++; //2 >> 3
        AccessWay.num++; //3 >> 4
        System.out.printf("num: %d\n", AccessWay.num); // 클래스명.static 변수 or 메소드, 이렇게 사용하는 것이 맞다.
        System.out.printf("num: %d\n", aw.num); //가능은 하나 static 때문에 객체화를 하지 않기 때문에 쓸일이 없다.
    }
}


class AccessWay {
    static int num = 0;

    AccessWay() { //1. 기본 생성자 호출
        increaseCnt(); //2. 메소드 호출
    }
    void increaseCnt() {
        num++; //3.
    }
}
