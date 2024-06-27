package afternoon.poly4;

public class TetzMain2 {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Tetz()};

        for (int i = 0; i < animals.length; i++) {
            animalDo(animals[i]);

            if(animals[i] instanceof Human){
                humanDo((Human)animals[i]);
            }
        }
    }
    public static void animalDo(Animal a) {
        System.out.println("동물기능 테스트");
        a.eat();
        a.sleep();
        System.out.println("동물기능 테스트 종료");
    }

    public static void humanDo(Human h) {
        System.out.println("사람기능 테스트");
        h.think();
        System.out.println("사람기능 테스트 종료");
    }
}
