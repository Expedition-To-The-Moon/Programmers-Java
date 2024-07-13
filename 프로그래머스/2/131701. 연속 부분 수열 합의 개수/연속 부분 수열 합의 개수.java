import java.util.*;

class Solution {
    public int solution(int[] elements) {
        HashSet<Integer> set = new HashSet<>();
        
        int max = elements.length;
        int len = 1;
        while (len <= max) {
            for (int i = 0; i < max; i++) {
                if (len == 1) set.add(elements[i]);
                int sum = elements[i];
                for (int j = i + 1; j < i + len; j++) {
                    int idx = j % max;
                    sum += elements[idx];
                }
                set.add(sum);
            }
            len++;
        }
        return set.size();
    }
}
