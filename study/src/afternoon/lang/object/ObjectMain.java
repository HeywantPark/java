package afternoon.lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();

        child.childMethod();
        child.parentMethod();

        System.out.println(child.toString());
        System.out.println(child.getClass());

        String ref1 = Integer.toHexString(child.hashCode());
        String ref2 = Integer.toHexString(System.identityHashCode(child));

        System.out.println("ref1 = " + ref1);
        System.out.println("ref2 = " + ref2);

        Object[] objects = {new Child(), new Parent(), new OtherClass()};

        System.out.println(size(objects));
    }
    public static int size(Object[] objects) {
        int size = 0;
        for (Object object : objects) {
            size ++;
        }
        return size;
    }
}
