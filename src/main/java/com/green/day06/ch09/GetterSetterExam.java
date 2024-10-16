package com.green.day06.ch09;

public class GetterSetterExam { //넣는 것 setter & 생성자, 빼는 것 getter

    public static void main(String[] args) {
        Student s1 = new Student(); //s1 객체
        s1.setName("홍길동");


        Student s2 = new Student(); //s2 객체
        s2.setName("신사임당");



    }
}


class Student {
    private String name; // 2. String name = this.name //멤버 필드, 전역 변수
    private int age;
    private float height;

    //this는 상수이고 나 자신의 주소값이 저장된 공간 (this는 상수이기 때문에 변경 불가함)
    //name-setter
    public void setName(String name) { //넣는 건 void 타입
        this.name = name; // 1. 외부에서 복사한 값을 this.name(나 자신의 주소값이 저장된 상수)에 준다. (s1과 this는 같은 주소값)
        /*
        Student th = new Student(); >> 새로운 객체 생성, 주소값 서로 다름
        th.name = name;
         */
    }



    //name-getter
    public String getName() { //빼는 건 return 타입(변수의 타입), 파라미터 필요 x
        return name; // 3.
    }

    //age-setter
    public void setAge(int age) { //넣는 건 void 타입, 파라미터 필요 o
        this.age = age;
    }

    //age-getter
    public int getAge() {
        return age;
    }

    //height-setter
    public void setHeight(float height) {
        this.height = height;
    }

    //height-getter
    public float getHeight() {
        return height;
    }



}
