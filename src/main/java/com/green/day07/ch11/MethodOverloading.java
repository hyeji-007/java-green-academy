package com.green.day07.ch11;

public class MethodOverloading {
    /*
    오버로딩은 메소드에서만 적용된다.
    오버로딩은 같은 이름의 메소드를 여러개 정의할 수 있는 기법
    매개변수는 종류 및 타입이 다르다면 가능하다.
    (같은 이름의 다른 메소드와 매개변수 구분이 된다면)

    매개변수명과 리턴타입은 전혀 상관이 없다.
    오로지 매개변수 타입의 개수와 순서가 중요하다.

    생성자도 메소드의 한 종류이기 때문에 오버로딩이 된다.
     - 오버로딩 조건: 이름은 클래스명과 같다, 리턴타입(반환형) 작성하면 안된다.

     */
    public MethodOverloading() {}
    public MethodOverloading(int n1) {}
    public MethodOverloading(int n1, int n2) {}
    public MethodOverloading(long n1, int n2) {}

    public void sum(int n1){}
    public void sum(int n1, int n2) {}
    //public void sum(int n2, int n1) {} //매개변수명으로 구분하지 않는다.
    public void sum(int n1, long n2) {}
    public void sum(long n2, int n1) {}
    public void sum(String str, int n1) {}
    public void sum(int n1, String str) {} //호출할 때 type 순서도 달라야함 (type가 같으면 x)
    //public String sum(int n1, int n2) { return "String";} //리턴타입으로는 구분하지 않는다



}

class Test {
    public static void main(String[] args) {
        MethodOverloading d = new MethodOverloading();
    }
}