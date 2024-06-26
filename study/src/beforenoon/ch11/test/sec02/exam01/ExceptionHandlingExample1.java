package beforenoon.ch11.test.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        int result = data.length();
        System.out.println("문자 수 : "+ result);
    }
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("this is java");
        printLength(null); //NullPointerException 에러 발생
        System.out.println("[프로그램 종료]");
    }
}
