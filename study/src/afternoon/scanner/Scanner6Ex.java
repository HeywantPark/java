package afternoon.scanner;

import java.util.Scanner;

public class Scanner6Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int randNum = (int) (Math.random() * 99);

        while (true) {
            System.out.print("랜덤 숫자를 입력하세요 : ");
            int inputNum = sc.nextInt();
            if (inputNum == randNum) {
                System.out.println("정답입니다. 랜덤숫자는 : " + randNum);
                break;
            }
            if (inputNum < randNum) {
                System.out.println("up!");
            } else {
                System.out.println("down!");
            }
        }
    }
}
