package afternoon.poly4;

public class TetzMain {
    public static void main(String[] args) {
        Dog d = new Dog();
        Tetz t = new Tetz();

         animalDo(d);
         animalDo(t);
         humanDo(t);
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
