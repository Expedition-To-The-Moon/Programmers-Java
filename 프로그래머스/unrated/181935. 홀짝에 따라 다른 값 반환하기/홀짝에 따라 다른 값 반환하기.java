class Solution {
    public int solution(int n) {
        int result = 0;
        
        if(n%2!=0){
            for(int i=1; i<=n; i++){
                result += i;
                i++;
            }
        } else {
            for(int i=2; i<=n; i++){
                result += i*i;
                i++;
            }
        }
        return result;
    }
}