class Solution {
    public int[] solution(String s) {
        int len = s.length();
        int[] answer = new int[len];
        
        int[] alp = new int[26];
        for (int i = 0; i < len; i++) {
            int ch = (int)(s.charAt(i) - 'a');
            answer[i] = alp[ch] == 0 ? -1 : i - alp[ch] + 1;
            alp[ch] = i + 1;
        }
        return answer;
    }
}