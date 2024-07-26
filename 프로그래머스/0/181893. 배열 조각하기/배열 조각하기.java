import java.util.*;

class Solution {
    public List solution(int[] arr, int[] query) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i : arr) {
            res.add(i);
        }
        
        for (int i = 0; i < query.length; i++) {
            int q = query[i];
            if (i % 2 == 0) {
                while (res.size() > q + 1) {
                    res.remove(q + 1);
                }
            } else {
                for (int j = 0; j < q; j++) {
                    res.remove(0);
                }                
            }
        }
        return res;
    }
}