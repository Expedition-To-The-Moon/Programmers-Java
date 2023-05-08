import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int res = 0;
        int sum = 0;
        for(int i : d){
            sum += i;
            if(sum <= budget){
                res++;
            } else{
                break;
            }
        }
        return res;
    }
}