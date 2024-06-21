package afternoon.extendss;

public class ElectricCar extends Car {

    @Override
    public void openDoor() {
        System.out.println("전기차의 문을 엽니다.");
    }

    @Override
    public void move() {
        System.out.println("전기차가 이동합니다.");
    }

    public void charge(){
        System.out.println("전기차를 충전합니다.");
    }
}
