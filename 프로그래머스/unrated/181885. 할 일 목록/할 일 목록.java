import java.util.*;

class Solution {
    public List solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        List<Integer> idx = new ArrayList<>();
        List<String> res = new ArrayList<>();
        
        for(int i=0; i<finished.length; i++){
            if(finished[i] != true){
                idx.add(i);
            }
        }
        for(int i : idx){
            res.add(todo_list[i]);
        }
        return res;
    }
}