class Solution {
    public long solution(int price, int money, int count) {
        long result = 0;
        long cash = 0;
        for(int i=1; i<=count; i++){
            cash += i*price;
        }
        
        if(cash - money > 0){
            result = cash - money;            
        }
        
        return result;
    }
}