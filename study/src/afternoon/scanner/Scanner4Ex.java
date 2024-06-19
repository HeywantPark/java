package afternoon.scanner;

import java.util.Scanner;

public class Scanner4Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 정수를 입력하세요: ");
        int firstNum = sc.nextInt();

        System.out.print("두번째 정수를 입력하세요: ");
        int secondNum = sc.nextInt();

        if (firstNum > secondNum) {
            System.out.println("첫번째 정수가 두번째 정수보다 큽니다.");
            return;
        }
        int sum = 0;
        for (int i = firstNum ; i <= secondNum; i++) {
               sum += i;
        }
        System.out.println("첫번째 정수부터 두번째 정수까지의 합은 : " + sum);
    }
}
