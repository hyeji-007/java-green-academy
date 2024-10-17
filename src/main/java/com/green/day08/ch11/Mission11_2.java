package com.green.day08.ch11;

public class Mission11_2 {

    //990925-1012999

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("990925-1012999");

        /*
        sb.replace(6, 7, " ");
        System.out.println(sb);

         */

        int dashIdx = sb.indexOf("-");
        System.out.println("dashIdx: " + dashIdx);
        sb.replace(dashIdx, dashIdx + 1, " ");
        System.out.println(sb);




        /*
        System.out.println(sb.indexOf("-"));
        sb.replace(sb.indexOf("-"), sb.indexOf("-")+1, " ");
        System.out.println(sb);

         */






        /*
         sb.replace(sb.indexOf("-"), sb.indexOf("-"), " ");
        System.out.println(sb);

         */




        /*
        sb.replace(7,7,"_"); {
            String str = sb.toString();

            System.out.println("sb4: " + sb);
            System.out.println("str5: " + str);
        }

         */

    }
}
