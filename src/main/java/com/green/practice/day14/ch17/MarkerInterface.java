package com.green.practice.day14.ch17;

public class MarkerInterface {
    public static void main(String[] args) {
        Report0 r0 = new Report0("Simple Funny News~");
        Report1 r1 = new Report1();
        Report2 r2 = new Report2();
        Report3 r3 = new Report3();

        Printer p = new Printer();
        p.printContents(r0);
        p.printContents(r1);
        p.printContents(r2);
        p.printContents(r3);
    }
}

interface Printable2 { //interface는 object클래스를 상속받을 수 없다.

    public abstract String getContents();
}
interface Upper {}
interface Lower {}

class Report0 extends Object implements Printable2 { //extends상속은 당일 상속만 가능, implements는 다중 상속 가능
    private String contents; //abstract String getContents(); >> 추상메소드 >> String 고정

    public Report0(String contents) { //기본생성자 자동으로 만들어주지 않는다.
        this.contents = contents;
    }

    @Override
    public String getContents() {
        return contents;
    }
}

class Report1 implements Printable2, Lower {
    public String getContents() {
        return "Simple Funny News~";
    } //기본 생성자를 갖는다.
}

class Report2 implements Printable2, Upper {
    public String getContents() {
        return "Simple Funny News~";
    }
}

class Report3 implements Printable2, Upper, Lower {
    public String getContents() {
        return "Simple Funny News~";
    }
}

class Printer {
    public void printContents(Printable2 doc) {
        if(doc instanceof Upper) {
            System.out.println((doc.getContents().toUpperCase()));
        } else if(doc instanceof Lower) {
            System.out.println(doc.getContents().toLowerCase());
        } else {
            System.out.println(doc.getContents());
        }
    }
}