package afternoon.ref;

import java.sql.SQLOutput;

public class CustomerMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.name = "박혜원";

        Customer customer2 = null;
        System.out.println(customer2);

        customer2 = customer1;
        System.out.println(customer2.name);
        System.out.println(customer1.name);
    }
}
