import java.util.*;

class Solution {
    public List solution(String myString) {
        String[] list = myString.split("x");
        Arrays.sort(list);
        
        List<String> res = new ArrayList<>();
        for(String s : list){
            if(!s.equals("")){
                res.add(s);
            }
        }
        return res;
    }
}