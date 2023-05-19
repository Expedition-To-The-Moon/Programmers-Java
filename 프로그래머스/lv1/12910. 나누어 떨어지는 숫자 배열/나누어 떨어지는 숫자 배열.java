import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i : arr){
            if((double)i%divisor == 0) res.add(i);
        }
        if(res.size() == 0){
            res.add(-1);
        }
        Collections.sort(res);
        
        int[] result = new int[res.size()];
        int ind = 0;
        for(int i : res){
            result[ind] = i;
            ind++;
        }
        return result;
    }
}