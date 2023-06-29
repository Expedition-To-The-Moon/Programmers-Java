class Solution {
    public int solution(String my_string, String is_prefix) {
        int res = 1;
        int idx = is_prefix.length();
        if(my_string.length() < is_prefix.length()){
            idx = my_string.length();
            return res = 0;
        }
        
        for(int i=0; i<idx; i++){
            char ch1 = my_string.charAt(i);
            char ch2 = is_prefix.charAt(i);
            if(ch1 != ch2){
                res = 0;
            }
        }
        return res;
    }
}