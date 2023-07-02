import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<String>();
        for(String s : strArr){
            if(!s.contains("ad")){
                list.add(s);
            }
        }
        
        String[] res = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
}