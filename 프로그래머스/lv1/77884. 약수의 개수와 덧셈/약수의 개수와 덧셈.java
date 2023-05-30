class Solution {
    public int solution(int left, int right) {
        int res = 0;
        while(left <= right){
            int cnt = 1;
            for(int i=2; i<=left; i++){
                if(left%i == 0){
                    cnt++;
                }
            }
            if(cnt%2 == 0){
                res += left;
            } else {
                res -= left;
            }
            left++;
        }
        return res;
    }
}