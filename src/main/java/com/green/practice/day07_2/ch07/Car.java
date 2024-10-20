package com.green.practice.day07_2.ch07;

public class Car {
    private String color;
    private String gearType;
    private int door;

    /*
    this 사용법 2가지
    1. this.  : 멤버필드, 멤버메소드 사용, this. 생략 가능할 때 있음
    2. this() : 생성자에서 다른 생성자 호출 시 사용 가능
     */

    public Car(String gearType, int door) {
        this("white", gearType, door);
    }

    public Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    public void introduce() {
        /*
        introduce 메소드가 호출이 된다는 말은 이미 객체 생성이 끝난 이후임
        생성자는 객체 생성시에만 호출할 수 있기 때문에 객체생성 이후에는 호출 불가
         */
        System.out.printf("%s 컬러의 %s 기어를 가진 %d개의 문짝이 있는 자동차\n", color, gearType, door);
    }

}

class CarTest {
    public static void main(String[] args) {
        //main메소드의 내용을 수정하지 않고
        //생성자를 이용하여
        //"white 컬러의 auto 기어를 가진 4개의 문짝이 있는 자동차"가 표시될 수 있게 해주세요.
        Car car1 = new Car("white", "auto", 4);
        car1.introduce();

        //"red 컬러의 manual 기어를 가진 5개의 문짝이 있는 자동차"가 표시될 수 있게 해주세요.
        Car car2 = new Car("red", "manual", 5);
        car2.introduce();

        //"white 컬러의 auto 기어를 가진 6개의 문짝이 있는 자동차"가 표시될 수 있게 해주세요.
        Car car3 = new Car("auto", 6);
        car3.introduce();


    }
}

