class Solution {
    public int solution(int[] number) {
        int result = 0;
        
        int l = number.length;
        for (int i = 0; i < l - 2; i++) {
            for (int j = i + 1; j < l - 1; j++) {
                for (int k = j + 1; k < l; k++) {
                   if (0 == number[i] + number[j] + number[k]) {
                       result++;
                   }
                }
            }
        }
        return result;
    }
}