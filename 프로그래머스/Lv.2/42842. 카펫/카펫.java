class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        
        int[] ans = new int[2];
        for (int i = 3; i <= total / 3; i++) {
            if (total % i == 0) {
                int col = total / i;
                int row = i;
                if ((col - 2) * (row - 2) == yellow) {
                    ans[0] = col;
                    ans[1] = row;
                    break;
                }
            }
        }
        return ans;
    }
}