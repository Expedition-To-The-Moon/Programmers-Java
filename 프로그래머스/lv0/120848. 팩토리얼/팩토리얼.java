class Solution {
    public int solution(int n) {
        int result = 0;
        int num = 1;
        
        for(int i=1; i<=10; i++){   
            num *= i;
            if(num > n) {
                result = i-1;
                break;
            } else if (num == n){
                result = i;
                break;
            }
        }
        return result;
    }
}