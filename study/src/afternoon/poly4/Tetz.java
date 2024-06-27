package afternoon.poly4;

public class Tetz implements Animal,Human{
    @Override
    public void eat() {
        System.out.println("테츠가 밥처럼 제로콜라를 콸콸콸");
    }
    @Override
    public void sleep() {
        System.out.println("테츠는 술만 먹으면 잠을 커..어..");
    }
    @Override
    public void think() {
        System.out.println("테츠가 수업에서 어떻게 웃길지 고민중");
    }
}
