package com.green.day08.ch13;

public class ArrayDeepCopy {

    public static void main(String[] args) {
        int[] arr = {10, 15, 23, 1, 8};
        int[] copyArr = new int[arr.length]; //arr과 같은 크기의 int 배열을 만들자

        for(int i = 0; i < arr.length; i++) {
            copyArr[i] = arr[i]; //deep copy //동등성(값이 같다)
        }

        System.out.println("arr == copyArr: " + (arr == copyArr)); //주소값은 달라서 false(deep copy는 서로 다른 객체에 접근)
        //참조변수끼리의 == 비교는 동일성(같은 주소값)을 묻는다.

        int[] arr2 = copyArr; //얕은 복사(shallow copy), 주소값 복사
        System.out.println("ar2 == copyArr: " + (arr2 == copyArr)); //true


        for(int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]: %d\n", i, arr[i]);
        }
        System.out.println();
        for(int i = 0; i < copyArr.length; i++) {
            System.out.printf("copyArr[%d]: %d\n", i, copyArr[i]);
        }










    }
}
