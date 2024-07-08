package afternoon.jeneric.method;

public class GenericMethodMain {
    public static void main(String[] args) {
        Integer integer1 = GenericMethod.<Integer> genericMethod(15);

        Integer integer2 = GenericMethod.<Integer>numberMethod(15);
    }
}
