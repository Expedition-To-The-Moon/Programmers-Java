class Solution {
    public String solution(String my_string, int s, int e) {
        String res = "";
        res += my_string.substring(0,s);
        for(int i=e; i>=s; i--){
            res += my_string.substring(i,i+1);
        }
        int idx = my_string.length();
        if(e != idx){
           res += my_string.substring(e+1,idx);
        }
        return res;
    }
}