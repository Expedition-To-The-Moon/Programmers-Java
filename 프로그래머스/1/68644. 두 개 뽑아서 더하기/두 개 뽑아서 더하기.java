import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public List solution(int[] numbers) {
        List<Integer> res = new ArrayList<Integer>();
        
        int n = numbers.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                int sum = numbers[i] + numbers[j];
                if(!res.contains(sum)){
                    res.add(sum);
                }
            }    
        }   
        Collections.sort(res);
        return res;
    }
}