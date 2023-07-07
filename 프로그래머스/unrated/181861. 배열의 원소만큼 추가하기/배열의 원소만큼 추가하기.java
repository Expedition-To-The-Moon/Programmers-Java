import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n = 0;
        for(int i : arr){
            for(int j=0; j<i; j++){
                list.add(arr[n]);
            }
            n++;
        }
    
        int[] res = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
}