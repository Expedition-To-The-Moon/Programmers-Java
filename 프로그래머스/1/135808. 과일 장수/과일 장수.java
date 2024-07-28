import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int result = 0;
        Arrays.sort(score);
        
        int size = score.length;
        int box = size / m;
        for (int i = 1; i <= box; i++) {
            int min = size - (i * m);
            result += score[min] * m;
        }
        return result;
    }
}
// 1~k
// 한상자 가격 m * p (p : 가장 낮은 점수, m : 개수)
