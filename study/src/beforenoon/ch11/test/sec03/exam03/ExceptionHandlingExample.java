package beforenoon.ch11.test.sec03.exam03;

import java.sql.SQLOutput;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo", null, "200"};
        for(int i=0; i<=array.length; i++) {
            try{
            int value = Integer.parseInt(array[i]);
            System.out.println("array[" + i + "]: " + value);
        } catch(NumberFormatException | NullPointerException e) {
             System.out.println( "인덱스에 문제가 있음 " + e.getMessage());
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스가 초과됨" + e.getMessage());
            }
        }
    }
}
