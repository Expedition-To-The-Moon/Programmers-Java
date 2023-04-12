class Solution {
    public int solution(int n) {
        int result = 0;
        int[] cnt = new int[n];

        for(int i=4; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i%j == 0) {
                    cnt[i-1]++;
                }    
            }
        }
        
        int num = 0;
        for(int i=0; i<cnt.length; i++){
            num =cnt[i];
            if(num >2) {
                result++;
            } 
        }
        return result;
    }
}