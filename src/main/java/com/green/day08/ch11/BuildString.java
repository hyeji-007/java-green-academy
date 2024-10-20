package com.green.day08.ch11;

public class BuildString {

    public static void main(String[] args) {
        StringBuilder sb10 = new StringBuilder("123");
        sb10.append(45678).delete(0, 2).replace(0, 3, "KK");
        System.out.println("sb10: " + sb10);
        //123
        //12345678
        //345678
        //KK678 >>이렇게 한방에 처리할 수 있는 것을 체이닝 기법이라고 함



        //문자열 "123"이 저장된 인스턴스 생성
        StringBuilder sb = new StringBuilder("123"); //반복문 안에서 문자열 수정에 용이함
        sb.append(45678); //오버로딩되어 있어서 타입은 상관 없음

        System.out.println(sb);

        sb.delete(0, 2);
        System.out.println(sb);

        //모든 문자열을 지우는 방법

        //System.out.println(sb.lastIndexOf(""));//되기는 하나 length보다 불리함
        sb.delete(0, sb.length());
        System.out.println("sb1:" + sb); //(length-1) >> lastIndex값


        sb.append(345678);
        System.out.println("sb2: " + sb);

        sb.replace(0,3,"AB"); {
            System.out.println("sb3: " + sb);
        }

        sb.replace(0,3,"AB"); {
            String str = sb.toString(); //StringBuilder에서 String타입으로 변경 가능하다.

            System.out.println("sb4: " + sb);
            System.out.println("str5: " + str);
        }

        StringBuilder sb2 = sb.reverse().replace(0,2,"KK");
        //체이닝 기법, 각 메소드에서 return this; 를 하기 때문 (한 줄로 적는 것이 가능함)
        //sb.reverse(); //나 자신의 주소값을 리턴하기 때문에 sb가 되는 것(나의 주소값, return this)
        //sb.replace(0,2,"KK"); // 나 자신의 주소값을 리턴 (return this)
        //<체이닝 기법> return this; 가 핵심이다.

        System.out.println("sb6: " + sb);
        System.out.println("sb == sb2: " + (sb == sb2)); //동일성 개념, 같은 주소 공유





    }
}
