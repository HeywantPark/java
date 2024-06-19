package afternoon.classs;

public class CustomerMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer("이혜원" , 25 , 23000 , true);
        customer1.printCustomer();

        Customer customer2 = new Customer();
        customer2.printCustomer();


    }
}
