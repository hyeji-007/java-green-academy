package com.green.practice.day13;

import java.util.ArrayList;
import java.util.List;

public class ListStudy2_2 {
    public static void main(String[] args) {
        /*
        Generic 제네릭
        제네릭을 사용하면 실행시에 타입이 결정된다.
        제네릭이 사용된 클래스에 타입을 결정하지 않으면 타입은 object가 된다.
        아래 3가지의 결과는 같으니 맘에 드는 걸 사용하도록
        */

        List<Integer> list = new ArrayList();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        System.out.println(list.size());
        int n1 = list.get(0);

        list.add(1, 60);
        System.out.println(list);
        System.out.println(list.size());

        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());

        list.add(0, 30);
        System.out.println(list);
        System.out.println("list.lastIndexOf(30): " + list.lastIndexOf(30));
        System.out.println("list.indexOf(30): " + list.indexOf(30));

        System.out.println("list.lastIndexOf(100): " + list.lastIndexOf(100));
        System.out.println("list.indexOf(100): " + list.indexOf(100));

        list.add(null);

        list.clear();
        System.out.println(list);
        System.out.println(list.size());
    }
}
