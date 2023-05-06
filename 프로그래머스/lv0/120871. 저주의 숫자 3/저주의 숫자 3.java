class Solution {
    public int solution(int n) {
        int cnt = 0;
        int result = 0;

        for(int i=0; i<=2*n; i++){
            cnt++;
            if(i%10 == 3 || i%100 == 3){
                cnt--;
            } else if(i%3 == 0){
                cnt--;
            } else if(i/10 == 3 || i/10 == 13){
                cnt--;
            }
            if(cnt==n){
                result =i;
                break;
            }
        }
        return result;
    }
}