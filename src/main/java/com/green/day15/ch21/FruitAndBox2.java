package com.green.day15.ch21;

public class FruitAndBox2 {
    public static void main(String[] args) {
        FruitBox appleBox = new FruitBox(new Apple());
        FruitBox orangeBox = new FruitBox(new Orange());
        Apple apple = (Apple)appleBox.getFruit();
        Orange orange = (Orange)orangeBox.getFruit();

        FruitBox orangeBox2 = new FruitBox("오렌지");
        Orange orange2 = (Orange)orangeBox2.getFruit(); //getFruit()이 넘기는 건 object 타입인데 Orange로 형변환하려고 하니 오류가 터짐
        //Orange와 Object는 아무 관계도 아니니 형변환 xxx

        System.out.println("--끝--");
    }
}

class FruitBox {
    private Object fruit;

    public FruitBox(Object object) {
        this.fruit = object;
    }

    public Object getFruit() {
        return fruit;
    }
}
