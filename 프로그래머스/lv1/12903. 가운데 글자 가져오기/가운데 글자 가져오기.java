class Solution {
    public String solution(String s) {
        String res = "";
        
        int len = s.length();
        if(len%2 == 0){
            res = s.substring(len/2-1,len/2+1);
        } else {
            res = s.substring(len/2,len/2+1);
        }
        return res;
    }
}