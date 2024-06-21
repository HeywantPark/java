package afternoon.extendss.access.child;

import afternoon.extendss.access.parent.Parent;

public class Child extends Parent {
    public void access() {
        System.out.println("publicValue : " + publicValue); // 어디서나 접근 가능
        System.out.println("protectedValue : " + protectedValue); // 다른 패키지이나 상속 관계
//        System.out.println("defaultValue : " + defaultValue); // 에러 발생, 다른 패키지
//        System.out.println("privateValue : " + privateValue); // 에러 발생, 내부에서만 접근 가능

        publicMethod();
        protectedMethod();
//        defaultMethod(); // 에러 발생, 다른 패키지
//        privateMethod(); // 에러 발생, 내부에서만 접근 가능

        printParent();
    }
}