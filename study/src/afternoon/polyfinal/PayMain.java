package afternoon.polyfinal;

import java.util.Scanner;

public class PayMain {
    public static void main(String[] args) {
        PaySystem paySystem = new PaySystem();
        Scanner scan = new Scanner(System.in);

        int option;
        int amount;

        System.out.print("결제 옵션을 입력하세요. (1. KB Pay / 2. Kakao Pay / 3. Naver Pay) :");
        option = scan.nextInt();
        System.out.print("결제 금액을 입력하세요 : ");
        amount = scan.nextInt();

        if (option == 1) {
            paySystem.setPay(new KBpay());
        } else if (option == 2) {
            paySystem.setPay(new KalaoPay());
        } else if (option == 3) {
            paySystem.setPay(new NaverPay());
        }
        paySystem.payment(amount);
    }
}
