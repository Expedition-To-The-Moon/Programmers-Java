class Solution {
    public String solution(String s, int n) {
        String res = "";
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == ' '){
                res += " ";
            } else {
                int start = (int)ch;
                int end = start + n;
                if(start <= 90 && end > 90) {
                    end = 64 + (end - 90); 
                } else if((start > 90 && start <= 122) && end > 122) {
                    end = 96 + (end - 122); 
                } 
                res += (char)end; 
            }
        }
        return res;
    }
}