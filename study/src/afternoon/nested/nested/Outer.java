package afternoon.nested.nested;

public class Outer {
    private static String outerStatic = "outerStatic";
    private String outerInstance = "outerInstance";

    static class Nested {
        private static String nestedStatic = "nestedStatic";
        private String nestedInstance = "nestedInstance";

        public void print() {
            //클래스 내부의 static 에 접근
            System.out.println("nestedStatic" + nestedStatic);
            System.out.println("outerStatic" + outerStatic);

            //클래스 내부의 non-static(인스턴트) 에 접근
            System.out.println("nestedInstance" + nestedInstance);
//            System.out.println("outerInstance" + outerInstance); 외부의 Instance 접근 불가
        }
    }
}
