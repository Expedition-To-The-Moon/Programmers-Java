import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] list = Arrays.copyOfRange(arr, 0, arr.length);
        Arrays.sort(arr);
        
        if(arr.length > 1){
            ArrayList<Integer> res = new ArrayList<Integer>();
            for(int i : list){
                if(i != arr[0]) res.add(i);
            }
            int[] rt = new int[res.size()];
            int ind = 0;
            for(int i : res){
                rt[ind] = i;
                ind++;
            }
            return rt;
        } else {
            int[] rt = {-1};
            return rt;
        }

    }
}