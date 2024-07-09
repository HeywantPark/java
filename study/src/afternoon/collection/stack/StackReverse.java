package afternoon.collection.stack;

import java.util.Stack;

public class StackReverse {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<Character>();
        String input = "다시합창합시다";

        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            stack.push(charArray[i]);
        }
        char[] reverseArr = new char[charArray.length];
        int i = 0;
        while (!stack.isEmpty()) {
            reverseArr[i++] = stack.pop();
        }
        String reverse = new String(reverseArr);
        System.out.println("input = " + input);
        System.out.println("reverse = " + reverse);

    }
}
