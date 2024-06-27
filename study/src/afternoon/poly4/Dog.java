package afternoon.poly4;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("강아지는 사료를 냠냠");
    }
    @Override
    public void sleep() {
        System.out.println("강아지는 꿀잠을 커..어..");
    }

}
