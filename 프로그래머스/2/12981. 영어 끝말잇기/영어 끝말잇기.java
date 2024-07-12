import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] result = {0, 0};
        
        List<String> arr = new ArrayList<>();
        char ch = words[0].charAt(0);
        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            if (ch != w.charAt(0) || arr.contains(w)) {
                result[0] = (i % n) + 1;
                int turn = (i + 1) / n;
                result[1] = (i + 1) % n == 0 ? turn : turn + 1;    
                break;
            } else {
                arr.add(w);
                int last = w.length() - 1; 
                ch = w.charAt(last);
            }           
        }
        return result;
    }
}
