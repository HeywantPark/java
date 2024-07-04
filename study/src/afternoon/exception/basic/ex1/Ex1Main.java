package afternoon.exception.basic.ex1;

import java.sql.SQLOutput;

public class Ex1Main {
    static class Parent {};
    static class Child extends Parent {
        void childMethod() {
            System.out.println("Child.childMethod");
        }
    };
    public static void main(String[] args) {
        try {
            Parent parent = new Parent();
            if (parent instanceof Child) {  // 객체가 Child 타입인지 확인
                Child poly = (Child) parent;
                poly.childMethod();
            } else {
                System.out.println("parent는 Child 타입이 아닙니다.");
            }
        } catch (ClassCastException e) {
            System.out.println("예외처리 완료");
            e.printStackTrace();

        }
    }
}
