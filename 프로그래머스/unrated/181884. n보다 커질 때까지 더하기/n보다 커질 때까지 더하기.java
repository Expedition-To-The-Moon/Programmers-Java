class Solution {
    public int solution(int[] numbers, int n) {
        int res = 0;
        for(int i : numbers){
            res += i;
            if(res > n){
                break;
            }
        }
        return res;
    }
}