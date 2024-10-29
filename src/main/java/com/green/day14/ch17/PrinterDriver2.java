package com.green.day14.ch17;

public class PrinterDriver2 {
    public static void main(String[] args) {
        String myDoc = "This is a report abount...";

        Printable prn1 = new Prn204Drv(); //부모는 자식의 객체값을 담을 수 있다.
        Printable prn2 = new Prn731Drv();
        //Prn204Drv d1 = (Prn204Drv)new Prn731Drv(); >>상속 관계에서만 형변환이 가능하다.

        prn1.print(myDoc);
        System.out.println();
        prn2.print(myDoc);

        //prn1 = prn2;
        System.out.println("----------------");

        Prn204Drv prn204 = (Prn204Drv)prn1;
        //prn204 = (Prn204Drv)prn2;
    }
}

class Prn204Drv implements Printable { //인터페이스는 추상 메소드밖에 가질 수 없다.
    @Override
    public void print(String doc) {
        System.out.println("FROM MD-204 printer");
        System.out.println(doc);
    }
}

class Prn731Drv implements Printable {
    @Override
    public void print(String doc) {
        System.out.println("FROM MD-731 printer");
        System.out.println(doc);
    }
}



