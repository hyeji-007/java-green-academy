package com.green.day09.ch13;

public class EnhancedForInst {
    public static void main(String[] args) {
        Product[] arr = new Product[4]; //Product 타입은 product객체의 주소값만 담을 수 있다.
        arr[0] = new Product("Coffee", 5000);
        arr[1] = new Product("Computer", 1_000_000);
        arr[2] = new Product("Apple", 7_000);
        arr[3] = new Product("Dress", 400_000);


        for (Product item : arr) {
            System.out.println(item);
        }

        int sum = 0;
        for (Product item : arr) {
            sum += item.getPrice();
        }
        System.out.printf("합계: %,d\n", sum);
        System.out.println("-------------------");

        //배열에서 제품명이 Apple인 것만 찾아서 콘솔에 출력
        for(Product item : arr) {
            if(item.getName().equals("Apple")) {
                System.out.println(item);
            }
        }


    }
}

class Product {
    private String name; //private에 값 넣는 방법: setter, 메소드
    private int price;

    Product (String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String toString() { //arr[0] 주소값에 들어있는 값 인출
        //return "제품명:" + name+ ", 가격:" + price;
        return String.format("제품명: %s, 가격: %,d원", name, price);
    }

}


