class Solution {
    public int solution(int n, int m, int[] section) {
        int result = 1;

        int start = section[0];
        int end = start + m - 1;
        
        for (int i = 0; i < section.length; i++) {
            if (section[i] > end) {
                end = section[i] + m -1;
                result++;
            }
        }
        return result;
    }
}