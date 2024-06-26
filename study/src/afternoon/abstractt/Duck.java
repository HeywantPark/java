package afternoon.abstractt;

public class Duck extends AbstractAnimal {
    @Override
    public void sound(){
        System.out.println("오리는 꽈악~");
    }
    @Override
    public void eat() {
        System.out.println("오리는 도토리 냠냠");
    }
    public void fly(){
        System.out.println("오리날다~~");
    }
}
