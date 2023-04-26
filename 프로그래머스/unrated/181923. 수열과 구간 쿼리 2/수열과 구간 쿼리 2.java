import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        
        for(int n=0; n<queries.length; n++){
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int i = queries[n][0]; i<=queries[n][1]; i++){
                if(arr[i] > queries[n][2]){
                    list.add(arr[i]);
                }
            }
            Collections.sort(list);
            if(list.size() == 0){
                result[n] = -1;
            } else {
                result[n] = list.get(0);
            }
        }
        return result;
    }
}
