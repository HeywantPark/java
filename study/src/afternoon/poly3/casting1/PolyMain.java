package afternoon.poly3.casting1;

public class PolyMain {
    public static void main(String[] args) {
        Child child = new Child();

//        child.childMethod();
//        child.parentMethod();

        Parent parent = new Child();
//        Child poly = (Child) parent;
//        poly.childMethod();

        ((Child) parent).childMethod();
    }
}
