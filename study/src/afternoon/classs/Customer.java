package afternoon.classs;

public class Customer {
    String name ;
    int age ;
    int total ;
    boolean blacklist ;


    Customer(){}
    Customer(String name, int age, int total, boolean blacklist) {
        this.name = "아직 몰라요";
        this.age = 0;
        this.total = 0;
        this.blacklist = false;
    }

    void printCustomer(){
        System.out.println("고객의 성함은? : " + this.name);
        System.out.println("고객의 나이는? : " + this.age);
        System.out.println("고객님의 총 사용 금액은? : " + this.total);
        System.out.println("블랙리스트 인가요? : " + this.blacklist);
    }
}
