package afternoon.poly3.overriding.ex2;

public class Duck extends Animal{
    @Override
    public void sound(){
        System.out.println("오리는 꽈악");
    }

    public void fly(){
        System.out.println("오리 날다");
    }
}
