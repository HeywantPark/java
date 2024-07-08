package afternoon.jeneric.ex2;

public class StrictGenericMain {
    public static void main(String[] args) {
        StrictGenericBox<String> strictGenericBox1 = new StrictGenericBox<>();
        strictGenericBox1.setValue("hello");
        System.out.println("strictGenericBox1.getValue = " + strictGenericBox1.getValue());

        StrictGenericBox<Integer> strictGenericBox2 = new StrictGenericBox<>();
        strictGenericBox2.setValue(10);
        System.out.println("strictGenericBox2.getValue = " + strictGenericBox2.getValue());

        StrictGenericBox<Double> strictGenericBox3 = new StrictGenericBox<>();
        strictGenericBox3.setValue(14.5);
        System.out.println("strictGenericBox3.getValue = " + strictGenericBox3.getValue());
    }
}
