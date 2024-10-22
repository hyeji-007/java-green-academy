package com.green.day11.ch16;

public class OverridingEquals {
    public static void main(String[] args) {

        String s1 = new String("10");
        String s2 = new String("10");

        System.out.println("s1 == s2: " + (s1 == s2));

        System.out.println("s1.equals(s2): " + s1.equals(s2));

        NumBox n1 = new NumBox(10);
        NumBox n2 = new NumBox(10);

        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2);

        //레퍼런스 변수끼리의 == 비교는 주소값 비교 (동일성 비교), 생성자를 호출할 때마다 객체가 만들어진다. 2번 호출 >> 2개 주소
        //n1, n2는 각각 객체생성으로 만든 주소값을 가지고 있기 때문에 주소값이 다르다
        //즉 2개의 NumBox 객체가 만들어졌다.

        // 주소값 비교
        System.out.println("n1 == n2: " + (n1 == n2)); //false

        // n1과 n2가 같은 값(num)을 가지고 있는지 equals로 비교
        System.out.println("n1.equals(n2): " + n1.equals(n2));
    }
}

class NumBox {
    private int num;

    NumBox(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object object) { //equals()메소드는 항상 Object 타입의 매개변수를 받음(모든 클래스의 최상위 부모 클래스가 Object이기 때문)
        if (object instanceof NumBox) { //전달된 객체(object)가 NumBox 클래스의 인스턴스인가?
            return num == ((NumBox) object).num;
        }
        return false;
    }



    /*
    @Override
    public boolean equals(Object object) {
        if (this == object) { //같은 객체를 가리킬 경우
            return true;
        }
        if (object == null || getClass() != object.getClass()) { //클래스가 다를 경우
            return false;
        }
        NumBox numBox = (NumBox) object; //형변환 후 num 비교
        return num == numBox.num;
    }
     */

    @Override
    public String toString() {
        return String.valueOf(num); //String.valueOf이용해서 int >> String
        // 메소드 ()소괄호가 보이기 때문에
        // static 메소드 >> 객체 생성 없이 <클래스이름.메소드>
        // 리턴타입이 String
        // 파라미터는 int타입

    }
}


