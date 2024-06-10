class Solution {
    public long solution(int n) {
        long[] res = new long[n];
        res[0] = 1L;
        if (n > 1) {
            res[1] = 2L;
            for (int i = 2; i < n; i++) {
                res[i] = (res[i-2] + res[i-1]) % 1234567;
            }
        }
        return res[n-1];
    }
}