import java.util.*;

class Solution {
    public List solution(int[] arr) {
        int a = arr.length;
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<a; i++){
            if(res.size() == 0){
                res.add(arr[i]);
            } else if(res.get(res.size()-1) == arr[i]){
                res.remove(res.size()-1);
            } else if(res.get(res.size()-1) != arr[i]){
                res.add(arr[i]);
            }
        }
        if(res.size() == 0){
            res.add(-1);
        }
        return res;
    }
}