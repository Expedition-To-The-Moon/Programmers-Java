import java.util.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int result = array[array.length/2];   
        return result;
    }
}