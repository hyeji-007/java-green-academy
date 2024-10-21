package com.green.practice.day09.ch13;

public class EnhancedForInst_2 {

    public static void main(String[] args) {
        Product[] arr = new Product[4];
        arr[0] = new Product("Coffee", 5_000);
        arr[1] = new Product("Computer", 1_000_000);
        arr[2] = new Product("Apple", 7_000);
        arr[3] = new Product("Dress", 400_000);



        for (Product item : arr) {
            System.out.println(item);
        }
        System.out.println();
        
        int sum = 0;
        for (Product item : arr) {
            sum += item.getPrice();
        }
        System.out.println("sum: " + sum);
        System.out.println();

        // 배열에서 제품명이 Apple인 것만 찾아서 콘솔에 출력
        for (Product item : arr) {
            if(item.getName().equals("Apple")) {
                System.out.println(item);
            }
        }

    }
}

class Product {
    private String name;
    private int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    //오버라이딩
    @Override  //애노테이션, 오버라이드 애노테이션을 작성하면 실수 방지
    public String toString() { //arr[0] 주소값에 들어있는 값 인출
        return String.format("제품명: %s, 가격: %,d원", name, price);
    }
}
