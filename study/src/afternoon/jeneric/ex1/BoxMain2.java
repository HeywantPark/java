package afternoon.jeneric.ex1;

import javax.swing.*;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.setObj(10);
        Integer integer = (Integer)integerBox.getObj();
        System.out.println("integer = " + integer);

        integerBox.setObj("20"); //실수 한 부분, 숫자에 문자열 대입
        Integer integer2 = (Integer)integerBox.getObj();

        ObjectBox stringBox = new ObjectBox();
        stringBox.setObj("hello");
        String string = (String) stringBox.getObj();
        System.out.println("string = " + string);
    }
}
