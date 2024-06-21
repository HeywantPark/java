package afternoon.access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(500);
        account.deposit(300);
        account.getBalance();
        account.deposit(-500);
        account.withdraw(300);
        account.withdraw(-50);
        account.withdraw(1100);
        account.getBalance();
    }
}
