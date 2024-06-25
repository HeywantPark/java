package afternoon.poly3.overriding;

public class OverridingMain {
    public static void main(String[] args) {
//        Parent parent = new Parent();
//        System.out.println("Parent value: " + parent.value);
//        parent.method();
//
//        Child child = new Child();
//        System.out.println("Child value: " + child.value);
//        child.method();

        Parent poly = new Child();
        System.out.println("Poly value: " + poly.value);
        poly.method();
    }
}
// 1. 다형적 참조
// 부모는 자식을 담을 수 있다!!
// 2. 메서드 오버라이딩
// 오버라이딩 된 메서드가 우선권을 가진다!!