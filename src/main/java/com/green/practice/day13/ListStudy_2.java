package com.green.practice.day13;

import java.util.ArrayList;
import java.util.List;

public class ListStudy_2 {
    /*
    List 인터페이스, Interface는 객체화 불가능하다.

    인터페이스는 부모역할만 한다. List를 상속받은
    Class(LinkedList, ArrayList)가 있다.
    둘 class는 결과는 똑같은데 처리방식이 다르다.
    LinkedList는 Node방식으로 데이터를 다루고
    ArrayList는 Array(배열)방식으로 데이터를 다룬다.
    LinkedList는 수정 위주의 작업이 많으면 유리하고
    ArrayList는 읽기 위주의 작업이 많으면 유리하다.

    List 변수명 = new ArrayList();
    List 변수명 = new LinkedList();

     */

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10);
        list.add(20);

        ArrayList list2 = (ArrayList)list;
        list2.add(30);
        list2.add("하하");

        int[] arr = new int[3];
        Object[] arr2 = new Object[4];
        arr2[0] = 10;
        arr2[2] = "하하";

        int val0 = (int)list.get(0); //Object는 type 상관 없이 형변환이 가능함
        System.out.println("val0: " + val0);

        String val3 = (String)list2.get(3);
        System.out.println("val3: " + val3);

        System.out.println(list);
        System.out.println(list2);
    }

}
