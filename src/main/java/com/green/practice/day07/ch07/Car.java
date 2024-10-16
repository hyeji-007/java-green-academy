package com.green.practice.day07.ch07;

public class Car {
    private String color;
    private String gearType;
    private int door;

    /*
    <정의할 때 생성자와 메소드의 다른 점 2가지>
    1. 생성자의 이름은 클래스명과 같다.
    2. 리턴타입(반환형) 작성하면 안된다.

    <this 사용법 2가지>
    1. this.  : 멤버필드, 멤버메소드 사용, this. 생략가능핧 때가 있다.
    2. this() : 생성자에서 다른 생성자 호출 시 사용 가능
     */

    /*
    public Car() {
        color = "white";
        gearType = "auto";
        door = 4;
    }
     */

    public Car() {//파라미터가 있는 생성자로 작업을 몰아준다.
        this("white", "auto", 4);
    }

    public Car(String gearType, int door) {
        this("white", gearType, door);
    }


    public Car(String color, String gearType, int door) {//파라미터가 있는 생성자
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    public void introduce() {
        /*
        this("dd", "ddd", 12);
        introduce 메소드가 호출이 된다는 말은 이미 객체생성이 끝난 이후이다.
        생성자는 오로지 객체 생성시에만 호출할 수 있기 때문에 객체생성 이후에는 호출 불가함
         */
        System.out.printf("%s 컬러의 %s 기어를 가진 %d개의 문짝이 있는 자동차\n", color, gearType, door);
    }


}

class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.introduce();

        Car c2 = new Car();
        c2.introduce();

        Car c3 = new Car("red", "menual", 5);
        c3.introduce();

        Car c4 = new Car("auto", 6);
        c4.introduce();

    }
}
