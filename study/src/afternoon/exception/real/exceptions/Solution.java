package afternoon.exception.real.exceptions;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
        boolean solution(String s) {
            boolean answer = true;
            Deque<Character> stack = new ArrayDeque<>();

            // for 반복문을 사용하여 문자 하나하나에 접근한다.
            for(int i = 0; i < s.length() ; i++) {
                char c = s.charAt(i);
                if(c == '(') {
                    stack.push(c);
                } else {
                    if(stack.isEmpty()) return false;
                    stack.pop();
                }
            }
            answer = stack.isEmpty();
            return answer;
        }
        public static void main(String[] args) {
            Solution s = new Solution();
            String s1 = "(())()";
            boolean result = s.solution(s1);
            System.out.println(result);
        }
    }
