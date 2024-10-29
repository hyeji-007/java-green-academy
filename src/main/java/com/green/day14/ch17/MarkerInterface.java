package com.green.day14.ch17;

public class MarkerInterface {
    public static void main(String[] args) {
        //Report0~3까지 객체화 해주세요.
        Report0 r0 = new Report0("Simple Funny News~");
        Report1 r1 = new Report1();
        Report2 r2 = new Report2();
        Report3 r3 = new Report3();

        //Printer 클래스 아래에 있는 PrintContents 메소드 호출하고 싶다.
        //호출할 때 r0의 주소값을 보내주세요.
        Printer p = new Printer(); //객체 주소값 호출
        p.printContents(r0);
        p.printContents(r1); //Lower
        p.printContents(r2); //Upper
        p.printContents(r3); //Lower
    }
}

interface Printable2 { //interface는 object클래스를 상속받을 수 없다.

    public abstract String getContents();
}
interface Upper {} //내용이 하나도 없는 인터페이스(그룹화)
interface Lower {}

class Report0 extends Object implements Printable2 { //extends 상속은 단일 상속만 가능 implements는 다중 상속 가능
    private String contents; //abstract String getContents(); 추상메소드 >> String 고정

    public Report0(String contents) { //기본생성자 자동으로 만들어주지 않는다.
        this.contents = contents;
    }

    @Override
    public String getContents() {
        return contents;
    }

}
class Report1 implements Printable2, Lower { //기본 생성자를 갖는다.
    public String getContents() {
        return "Simple Funny News~";
    }
}
class Report2 implements Printable2, Upper {
    public String getContents() {
        return "Simple Funny News~";
    }
}
class Report3  implements Printable2, Lower, Upper {
    public String getContents() { //getContents() 타입은 String이다.
        return "Simple Funny News~";
    }
}

class Printer {
    public void printContents(Printable2 doc) {
        if(doc instanceof Upper) {
            System.out.println(doc.getContents().toUpperCase()); //콘텐츠 내용이 대문자로 찍힘 //getContents().toUpperCase()는 String 메소드
        } else if(doc instanceof Lower) {
            /*
            String str = doc.getContents();
            System.out.println(str.toLowerCase());

             */

            System.out.println(doc.getContents().toLowerCase());
        } else {
            System.out.println(doc.getContents());
        }
    }
}


