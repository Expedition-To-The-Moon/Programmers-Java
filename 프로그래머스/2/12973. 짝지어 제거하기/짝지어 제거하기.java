import java.util.Stack;

class Solution {
    public int solution(String s) {
        int res = 0;
        String[] arr = s.split("");
        
        Stack<String> str = new Stack<String>();
        for(int i=0; i<s.length(); i++){
            String word = arr[i];
            if(str.isEmpty() || !str.peek().equals(word)){
                str.push(word);
            } else if(str.peek().equals(word)){
                str.pop();
            }
        }
        if(str.isEmpty()){ 
            res = 1;
        }
        return res;
    }
}