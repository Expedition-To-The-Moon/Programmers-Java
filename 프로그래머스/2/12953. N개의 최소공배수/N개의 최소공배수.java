import java.util.*;

class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        int maxIdx = arr.length;
        int max = arr[maxIdx - 1];

        List<Integer> div = new ArrayList<>();
        for (int i = 2; i <= max;) {
            int cnt = 0;
            for (int j = 0; j < maxIdx; j++) {
                if (arr[j] == 1) continue;
                if (arr[j] % i == 0) {
                    cnt++;
                    arr[j] /= i;
                }
            }
            if (cnt != 0) div.add(i);
            if (cnt == 0) i++;
        }

        int result = 1;
        for (int d : div) {
            result *= d;
        }
        return result;
    }
}