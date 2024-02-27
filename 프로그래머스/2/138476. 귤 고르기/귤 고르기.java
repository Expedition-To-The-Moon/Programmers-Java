import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        Integer[] cnt = new Integer[10000001];
        Arrays.fill(cnt, 0);
        for (int t : tangerine) {
            cnt[t]++;
        }
        Arrays.sort(cnt, Collections.reverseOrder());
        
        int i = 0;
        while (k > 0) {
            if (k - cnt[i] <= 0) {
                k = 0;
            } else {
                k -= cnt[i];
                i++;
            }
            answer++;
        }
        return answer;
    }
}