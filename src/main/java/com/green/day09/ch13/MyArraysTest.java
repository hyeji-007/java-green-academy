package com.green.day09.ch13;

import java.util.Arrays;

public class MyArraysTest {
    public static void main(String[] args) {
        int[] arr = { 3, 10, 66, 7 };
        System.out.println(Arrays.toString(arr));
        System.out.println(MyArrays.toString1(arr));
        System.out.println(MyArrays.toString2(arr));
        System.out.println(MyArrays.toString3(arr));
        //클래스명.메소드 >> static 메소드

        int[] arr2 = Arrays.copyOf(arr, 4);
        System.out.println(arr == arr2);
        System.out.println(MyArrays.toString(arr2));



        int[] arr3 = MyArrays.copyOf(arr);
        System.out.println(arr == arr3); //false
        System.out.println(MyArrays.toString(arr3)); //[3, 10, 66, 7]

        int[] arr4 = Arrays.copyOf(arr, 2);
        System.out.println(MyArrays.toString(arr4)); //[3, 10]

        int[] arr5 = Arrays.copyOf(arr, 3);
        System.out.println(MyArrays.toString(arr4)); //[3, 10 , 66]











    }
}
