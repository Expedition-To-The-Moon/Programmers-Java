import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String res = "";
        String[] list = s.split("");
        Arrays.sort(list, Collections.reverseOrder());
        for(String str : list){
            res += str;
        }
        return res;
    }
}