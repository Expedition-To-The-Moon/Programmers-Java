import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int idx = num_list.length;
        
        int[] answer = new int[idx-5];
        Arrays.sort(num_list);
        
        for(int i=0; i<idx-5; i++){
            answer[i] = num_list[i+5];
        }
        return answer;
    }
}