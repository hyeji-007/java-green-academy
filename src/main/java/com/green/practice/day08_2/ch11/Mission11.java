package com.green.practice.day08_2.ch11;

public class Mission11 {
    public static void main(String[] args) {
            /*
    다음 주민등록 번호의 중간에 삽인된 '-'를 지우고 공백으로 채워서
    출력하는 프로그램을 작성해보자.
    단, StringBuilder 클래스를 활용하여 빈번한 문자열 생성이
    발생하지 않도록 해야 한다.

    990925-101299

    콘솔에 990925 101299 가 출력이 되면 된다.
     */

        StringBuilder sb = new StringBuilder("990925-101299");
        int dashIdx = sb.indexOf("-");
        //System.out.println(sb.replace(dashIdx, dashIdx + 1, " "));
        sb.replace(dashIdx, dashIdx + 1, " ");
        System.out.println(sb);
    }

}
