package beforenoon.ch07.sec04.exam01;

public class Calculator {
    //메서드 선언
    public double areaCircle(double radius) {
        System.out.println("Calculator 객체의 areaCircle() 실행");
        return 3.1459 * radius * radius;
    }

    public class Computer extends Calculator {
        //메서드 오버라이딩
        @Override
        public double areaCircle(double radius) {
            System.out.println("Computer 객체의 areaCircle() 실행");
            return Math.PI * radius * radius;
        }
    }
}
