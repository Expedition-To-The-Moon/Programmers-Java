class Solution {
    public int solution(int a, int b) {
        int res = 2*(a+b);
        if(a%2 == 1 && b%2 == 1){
            res = a*a + b*b;
        } else if (a%2 == 0 && b%2 == 0){
            res = Math.abs(a-b);
        }
        return res;
    }
}