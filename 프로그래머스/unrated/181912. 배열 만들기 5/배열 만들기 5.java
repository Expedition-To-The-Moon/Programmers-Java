import java.util.*;

class Solution {
    public List solution(String[] intStrs, int k, int s, int l) {
        List<Integer> res = new ArrayList<>();
        for(String str : intStrs){
            String part = str.substring(s,s+l);
            int num = Integer.parseInt(part);
            if(num > k){
                res.add(num);
            }
        }
        return res;
    }
}