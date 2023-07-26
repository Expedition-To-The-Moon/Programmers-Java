import java.util.*;

class Solution {
    public List solution(int[] arr) {
        List<Integer> idx = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 2){ idx.add(i); }
        }
        
        List<Integer> res = new ArrayList<>();
        if(idx.size() != 0){
            int start = idx.get(0);
            int end = idx.get(idx.size()-1); 
            for(int i=start; i<=end; i++){
                res.add(arr[i]);
            }
        } else {
            res.add(-1);
        }
        return res;
    }
}