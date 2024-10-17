package com.green.practice.day08;

class Dog {
    String name;
    int age;

    //생성자
    public Dog(String name, int age) {
        this.name = name; //객체의 이름 초기화
        this.age = age; //객체의 나이 초기화
    }

    //객체의 정보 출력하는 메소드
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

}



public class Main {
    public static void main(String[] args) {
        //Dog 객체 생성(생성자 호출)
        Dog myDog = new Dog("Buddy", 3);

        //객체의 정보 출력
        myDog.displayInfo();

    }
}
