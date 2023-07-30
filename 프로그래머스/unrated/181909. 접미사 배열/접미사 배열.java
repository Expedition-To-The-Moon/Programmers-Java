import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        int len = my_string.length();
        String[] res = new String[len];
        for(int i=0; i<len; i++){
            res[i] = my_string.substring(len-1-i,len);
        }
        Arrays.sort(res);
        return res;
    }
}