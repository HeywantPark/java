package afternoon.scanner;

import java.util.Scanner;

public class Scanner3Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요 : ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 정수를 입력하세요 : ");
        int num2 = sc.nextInt();

        int sub = num1 - num2;
        System.out.println("두 수의 차는 : " + sub);

        int mul = num1 * num2;
        System.out.print("두 수의 곱은 : " + mul);

    }
}
