import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> cloth = new HashMap<>();
        for (String[] c : clothes) {
            if (!cloth.containsKey(c[1])) {
                cloth.put(c[1], 1);
            } else if (cloth.containsKey(c[1])) {
                cloth.put(c[1], cloth.get(c[1]) + 1);
            }
        }
        for (int i : cloth.values()) {
            answer *= (i + 1);
        }
        return answer - 1;
    }
}