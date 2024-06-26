package afternoon.abstractt;

public class Cat extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("고양이는 냐양");
    }
    @Override
    public void eat() {
        System.out.println("고양이는 츄르 냠냠");
    }

}
