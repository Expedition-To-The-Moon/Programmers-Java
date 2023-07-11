class Solution {
    public int solution(String my_string, String is_suffix) {
        int res = 0;
        
        int l1 = my_string.length();
        int l2 = is_suffix.length();
        if(l1 >= l2){
            for(int i=0; i<l2; i++){
                char ch1 = my_string.charAt(l1-1-i);
                char ch2 = is_suffix.charAt(l2-1-i);
                if(ch1 != ch2){
                    res = 0;
                    break;
                } else {
                    res = 1;
                }
            }
        }
        return res;
    }
}