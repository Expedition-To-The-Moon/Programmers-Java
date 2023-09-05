import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int len = score.length;
        int[] res = new int[len];
        int[] num = new int[len];
        for(int i=0; i<len; i++){
            num[i] = score[i][0] + score[i][1];
        }
        int[] copy = num.clone();
        Arrays.sort(copy);
        
        for(int j=0; j<len; j++){
            int n = num[j];
            for(int k=0; k<len; k++){
                if(n == copy[k]){
                    res[j] = len-k;
                }
            }
        }
        return res;
    }
}