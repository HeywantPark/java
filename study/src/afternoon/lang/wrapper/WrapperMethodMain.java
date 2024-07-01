package afternoon.lang.wrapper;

public class WrapperMethodMain {
    public static void main(String[] args) {
        int intvalue = Integer.parseInt("200");
        System.out.println("intvalue = " + intvalue);

        //비교
        Integer a = 10;
        System.out.println(a.compareTo(20));

        //산술연산
        System.out.println(Integer.sum(a, 20));
        System.out.println(Integer.min(a, 10));
        System.out.println(Integer.max(a, 10));
    }
}
