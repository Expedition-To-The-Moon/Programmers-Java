import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int l = numlist.length;
        int[] result = new int[l];
        
        double[] min = new double[l];
        for(int i=0; i<l; i++){
            if(numlist[i] - n < 0){
                min[i] = ((int)Math.abs(numlist[i] - n)) + 0.5;
            } else {
                min[i] = numlist[i] - n;
            }
        }
        Arrays.sort(min);
        
        for(int i=0; i<l; i++){
            if(min[i] % 1 != 0){
                result[i] = n - (int)min[i];
            } else {
                result[i] = n + (int)min[i];
            }
        }
        return result;
    }
}