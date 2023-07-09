import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] str = my_string.split(" ");
        
        ArrayList<String> list = new ArrayList<String>();
        for(String s : str){
            if(!s.equals("")){
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