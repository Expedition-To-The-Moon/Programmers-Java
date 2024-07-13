class Solution {
    public int solution(int n, int a, int b) {
        a--; b--;
        int answer = 1;
 
        boolean isTrue = true;
        while (isTrue) {
            int num = (int) Math.pow(2, answer);
            int A = (int) Math.ceil(a / num);
            int B = (int) Math.ceil(b / num);
            if (A == B) {
                isTrue = false;
            } else {
                answer++;
            }
        }
        return answer;
    }
}