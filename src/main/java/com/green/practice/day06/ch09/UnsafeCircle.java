package com.green.practice.day06.ch09;

public class UnsafeCircle {

    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRad(1.5);
        System.out.println("원의 넓이(1): " + c.getArea());

        c.setRad(2.5);
        System.out.println("원의 넓이(2): " + c.getArea());

        c.setRad(-3.3);
        System.out.println("원의 넓이(3): " + c.getArea());

        c.rad = -3.3; //setRad를 통했다면 음수로 출력x, 문제 발생 가능성 o
        System.out.println("원의 넓이(4): " + c.getArea());
        /*
        rad 멤버필드/멤버변수를 private 설정하지 않았기 때문에 문제가 발생함.
         */

    }

}

class Circle {
    double rad = 0; //원의 반지름, rad: 멤버필드/멤버변수
    final double PI = 3.14; //상수, 값을 변경할 수 없다

    public void setRad(double r) {
        if(r < 0) {
            rad = 0;
            return;
        }
        rad = r;
    }

    public double getArea() {
        return (rad * rad) * PI;
    }
}


