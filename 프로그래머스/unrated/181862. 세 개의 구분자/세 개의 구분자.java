import java.util.*;

class Solution {
    public List solution(String myStr) {
        String[] word = {"a", "b", "c"};
        
        String[] li = new String[myStr.length()];
        String arr = "";
        
        for(String s: word){
            arr = myStr.replace(s, "-");
            myStr = arr;
        }
        
        li = arr.split("-");
        List<String> res = new ArrayList<>();
        for(String s: li){
            if(s.length() > 0){
                res.add(s);
            }
        }
        if(res.size() == 0){
            res.add("EMPTY");
        }
        
        return res;
    }
}