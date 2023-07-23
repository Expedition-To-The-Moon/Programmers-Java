import java.util.*;

class Solution {
    public List solution(int[] arr, boolean[] flag) {
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(flag[i]){
                for(int j=0; j<arr[i]*2; j++){
                    res.add(arr[i]);
                }
            } else {
                for(int j=0; j<arr[i]; j++){
                    res.remove(res.size()-1);
                }
            }
        }
        return res;
    }
}