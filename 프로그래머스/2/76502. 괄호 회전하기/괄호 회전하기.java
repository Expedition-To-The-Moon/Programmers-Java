import java.util.*;

class Solution {
    public int solution(String s) {
        int result = 0;
        
        int len = s.length();
        Stack<Character> stack = new Stack<>();
        // 전체
        for (int i = 0; i < len; i++) {
            // 개별 확인
            for (int j = 0; j < len; j++) {
                int k = (i + j) % (len);
                char ch = s.charAt(k);
                if (stack.isEmpty()) {
                    stack.push(ch);
                } else if (ch == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (ch == ']' && stack.peek() == '[') {
                    stack.pop();
                } else if (ch == '}' && stack.peek() == '{') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
            if (stack.isEmpty()) {
                result++;
            } else {
                stack.clear();
            }
        }
        return result;
    }
}