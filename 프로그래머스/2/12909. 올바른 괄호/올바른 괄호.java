import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> li = new Stack<>();
        int l = s.length();
        for(int i=0; i<l; i++){
            char c = s.charAt(i);
            if(c == '('){
                li.push(c);
            } else {
                if(li.empty()){
                   return false; 
                }
                li.pop();
            }
        }
        if(!li.empty()){
            return false;
        }
        return true;
    }
}