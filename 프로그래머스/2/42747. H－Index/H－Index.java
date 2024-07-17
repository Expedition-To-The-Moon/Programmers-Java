import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int answer = 0;
        
        int max = citations.length;
        for (int i = 0; i < max; i++) {
            if (citations[i] >= max -i) {
                answer = max -i;
                break;
            }
        }
        return answer;
    }
}