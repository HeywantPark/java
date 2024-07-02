package afternoon.nested.inner;

public class Outer {
    private static String outerStatic = "outerStatic";
    private String outerInstance = "outerInstance";

    class Inner {
        private static String InnerStatic = "InnerStatic";
        private String InnerInstance = "InnerInstance";

        public void print() {
            //클래스 내부의 static 에 접근
            System.out.println("InnerStatic = " + InnerStatic);
            System.out.println("outerStatic = " + outerStatic);

            //클래스 내부의 non-static(인스턴트) 에 접근
            System.out.println("InnerInstance = " + InnerInstance);
            System.out.println("outerInstance" + outerInstance);
        }
    }
}
