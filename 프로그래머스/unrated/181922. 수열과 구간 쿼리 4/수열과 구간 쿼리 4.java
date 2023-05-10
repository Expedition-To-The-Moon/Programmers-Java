import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
         ArrayList<Integer> list = new ArrayList<Integer>();
        for(int n : arr){
            list.add(n);
        }
        for(int j=0; j<queries.length; j++){
            int s = queries[j][0];
            int e = queries[j][1];
            for(int i=s; i<=e; i++){
                if((double)i % queries[j][2] == 0){
                    int num = list.get(i)+1;
                    list.set(i, num);
                }
            }
        }
        int i = 0;
        for(int n : list){
            arr[i] = n;
            i++;
        }
        return arr;
    }
}