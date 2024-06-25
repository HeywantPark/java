package afternoon.poly3.casting1;

public class CastingMain2 {
    public static void main(String[] args) {
        // # 1번 코드
        Parent p1 = new Child();
        Child c1 = (Child) p1;
        c1.childMethod();

        // # 2번 코드
        Parent p2 = new Parent();
        Child c2 = (Child) p2;
        c2.childMethod(); //classException 에러
    }
}
