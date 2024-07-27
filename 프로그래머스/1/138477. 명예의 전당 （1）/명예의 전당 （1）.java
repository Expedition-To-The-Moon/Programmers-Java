import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        ArrayList<Integer> hall = new ArrayList<>();
        int[] answer = new int[score.length];
        
        hall.add(score[0]);
        answer[0] = score[0];
        int min = score[0];
        for (int i = 1; i < score.length; i++) {
            if (hall.size() < k) {
                hall.add(score[i]);
            } else if (score[i] > min) {
                hall.remove(Integer.valueOf(min));
                hall.add(score[i]);
            }
            min = Collections.min(hall);
            answer[i] = min;
        }
        return answer;
    }
}
