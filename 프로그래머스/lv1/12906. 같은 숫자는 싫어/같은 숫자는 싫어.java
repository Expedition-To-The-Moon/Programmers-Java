import java.util.ArrayList;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(arr[0]);
        int num = list.get(0);
        for(int i : arr){
            if(num != i){
                list.add(i);
                num = i;
            }
        }
        int[] res = new int[list.size()];
        int i=0;
        for(int j : list){
            res[i] = j;
            i++;
        }
        return res;
    }
}