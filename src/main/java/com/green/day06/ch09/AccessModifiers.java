package com.green.day06.ch09;

public class AccessModifiers {

    /*
    접근 수준 지시자: private, default(작성 안함), protected, public

    private: class내에서만 접근 가능
    default: private + 같은 패키지면 접근 가능 >> 사용 안함
    protected: default + 상속 관계면 접근 가능
    public: 무조건 접근 가능, 완전 오픈

    class는 보통 public 붙이고
    멤버필드는 대부분 private이다.
        - private를 붙이지 않아도 되는 경우가 있다 >>> 상수는 오픈해도 된다. (어차피 안 변함)
        - 변수는 무조건 private (은닉화/캡슐화)
        - private는 멤버필드를 읽기/쓰기할 때 메소드를 통해서한다. (getters/setters),
        - private 수정할 수 있는 방법은 setters와 생성자를 통해서만 가능하다.

     */

}
