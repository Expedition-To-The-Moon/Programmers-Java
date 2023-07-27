import java.util.*;

class Solution {
    public List solution(String[] str_list) {
        int idx1 = -1;
        int idx2 = -1;
        for(int i=0; i<str_list.length; i++){
            if(str_list[i].equals("l")){
                idx1 = i;
                break;
            } else if(str_list[i].equals("r")){
                idx2 = i;
                break;
            }
        }
        
        List<String> res = new ArrayList<>();
        if(idx1 != -1){
            for(int i=0; i<idx1; i++){
                res.add(str_list[i]);
            }            
        } else if(idx2 != -1){
            for(int i=idx2+1; i<str_list.length; i++){
                res.add(str_list[i]);
            }       
        }
        return res;
    }
}