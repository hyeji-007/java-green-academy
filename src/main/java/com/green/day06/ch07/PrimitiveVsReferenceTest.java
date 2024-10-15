package com.green.day06.ch07;

/*
    일반 변수(primitive type)
    참조 변수(reference type)
    차이점을 설명하는 예제
 */




public class PrimitiveVsReferenceTest {

    public static void main(String[] args) {

        int num = 10; //지역 변수
        changeNum(num); //changeNum(int num)과 공간이 다르다. primitive 타입 특.
        System.out.println("num: " + num); //10

        /*
        main메소드에 있는 num변수(main-num)dhk changeNum메소드에 있는 num매개변수(m-num)는
        다른 공간이다. main-num이 가지고 있는 값을 복사하여 m-num에 저장했다.
        m-num값을 변경한다고 하여 main-num값이 변경되는 것은 아니다. 왜? 다른 공간이기 때문
         */


        NumberBox nb = new NumberBox();
        nb.num = 10;
        ChangeNum(nb);
        System.out.println("nb.num: " + nb.num); //100


    }

    public static void changeNum(int num) {
        num = 100;
    }

    public static void ChangeNum(NumberBox nb) {
        nb.num = 100;
    }

}

class NumberBox {
    int num;
}
