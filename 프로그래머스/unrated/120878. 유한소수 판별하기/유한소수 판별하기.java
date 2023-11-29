class Solution {
    public int solution(int a, int b) {
        int res = 2;
        while(b % 2 == 0 || b % 5 == 0){
            if(b % 2 == 0){ b /= 2; }
            if(b % 5 == 0){ b /= 5; }
        }
        if(a % b == 0){ res = 1; }
        return res;
    }
}