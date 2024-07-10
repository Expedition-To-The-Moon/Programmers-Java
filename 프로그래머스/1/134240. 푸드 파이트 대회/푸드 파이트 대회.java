import java.util.*;

class Solution {
    public String solution(int[] food) {
        String result = "";
        List<Integer> arr = new ArrayList<>();
        for (int i = 1; i < food.length; i++) {
            int num = food[i] / 2;
            for (int j = 0; j < num; j++) {
                arr.add(i);
            }
        }
        
        int len = arr.size();
        for (int i = 0; i < len; i++) {
            result += arr.get(i);
        }
        
        result += "0";
        for (int i = len - 1; i >= 0; i--) {
            result += arr.get(i);
        }
        return result;
    }
}