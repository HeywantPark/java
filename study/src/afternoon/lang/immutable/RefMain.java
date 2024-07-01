package afternoon.lang.immutable;

import javax.management.ImmutableDescriptor;

public class RefMain {
    public static void main(String[] args) {
        User user1 = new User("혜원");
        User user2 = user1;

        System.out.println("user1: " + user1);
        System.out.println("user2: " + user2);

        user2.setName("연비");
        System.out.println("user2의 이름을 '연비'로 변경");
        System.out.println("user1: " + user1);
        System.out.println("user2: " + user2);
    }
}
