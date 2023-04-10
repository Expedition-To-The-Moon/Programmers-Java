import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int result = 1;
        
        if(sides[1] != sides[2]){
            if(sides[0]+sides[1] <= sides[2]){
               result = 2;
            }
        } 
        return result;
    }
}