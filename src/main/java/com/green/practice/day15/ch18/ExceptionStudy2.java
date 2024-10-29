package com.green.practice.day15.ch18;

public class ExceptionStudy2 {
    /*
    메소드 호출하는 코드를 작성했는데 빨간줄이고 마우스를 올려서 메시지를 확인해보니
    Unhandled Exception이라는 내용이 보이면 해당 메소드는 예외를 던지고(throw)하고 있기 때문에
    호출하는 부분에서 try-catch로 해결을 해주어야 한다. (호출부분을 감싸줘야 한다.)
     */
    public static void main(String[] args) {
        int r = 0;
        try {
            r = div (10, 2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("r: " + r);
    }

    public static int div(int n1, int n2) throws Exception { //예외가 발생하면 해결하지 않고 던짐
        return n1/ n2;
    }

}
