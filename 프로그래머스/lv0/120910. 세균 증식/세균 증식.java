class Solution {
    public int solution(int n, int t) {
        int result = 0;
        double num = Math.pow(2,t);
        result = n*(int)num;
        return result;
    }
}