import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int min = 100;
        int result = n;
        Arrays.sort(array);
        
        for(int i=0; i<array.length; i++){
            int absNum = Math.abs(array[i] - n);
            if(absNum < min){
                min = absNum;
                result = array[i];
            } 
        }
        return result;
    }
}