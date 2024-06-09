class Solution {
    public int solution(int a, int b, int n) {
        int result = 0;
        while(n >= a) {
            int get = (n / a) * b;
            n = get + n % a;
            result += get;
        }
        return result;
    }
}