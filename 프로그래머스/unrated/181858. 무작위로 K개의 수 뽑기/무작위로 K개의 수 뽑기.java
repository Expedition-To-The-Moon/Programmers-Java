import java.util.*;

class Solution {
    public List solution(int[] arr, int k) {
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            int n= arr[i]; 
            if(res.size() == k){ break;}
            if(!res.contains(arr[i])){
                 res.add(n);
            }
        }
        
        if(res.size() != k){
            int i = k - res.size();
            for(int j=0; j<i; j++){
                res.add(-1);
            }
        } 
        return res;
    }
}