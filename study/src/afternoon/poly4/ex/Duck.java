package afternoon.poly4.ex;

public class Duck implements Animal , Fly{
    public void fly() {
        System.out.println("오리날다~~");
    }
    public void eat() {
        System.out.println("오리는 도토리를 냠냠");
    }
    public void sound() {
        System.out.println("오리는 꽈악!");
    }
}
