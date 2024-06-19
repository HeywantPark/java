package ch06.test.sec06.exam01;

public class Car {
    String model; // null
    boolean start; // false
    int speed; // int

    class CarMain {
        public static void main(String[] args) {
            Car car = new Car();
            System.out.println(car.model);
            System.out.println(car.start);
            System.out.println(car.speed);
        }
    }
}
