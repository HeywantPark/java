package afternoon.nested.local.ex4;

import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);

        System.out.println("=== 도서 관리 프로그램에 오신 것을 환영합니다.===");
        while (true) {
            System.out.println("=== 원하는 기능을 선택 하세요 ===");
            System.out.println("1. 도서 추가 / 2. 도서 목록 출력 / 3.프로그램 종료 : ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                lib.addBook();
            } else if (choice == 2) {
                lib.showBook();
            } else {
                System.out.println("===프로그램을 종료합니다.===");
                break;
            }
        }
    }
}
