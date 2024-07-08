package afternoon.jeneric.ex3;

public class PairMain {
    public static void main(String[] args) {
        Pair<String, String> nameData = new Pair<>("박혜원","name");
        Pair<Integer, String> ageData = new Pair<>(27,"age");
        Pair<Boolean, String> marriedData = new Pair<>(false,"married");

        System.out.println("name: " + nameData.toString());
        System.out.println("age: " + ageData.toString());
        System.out.println("married: " + marriedData.toString());
    }
}
