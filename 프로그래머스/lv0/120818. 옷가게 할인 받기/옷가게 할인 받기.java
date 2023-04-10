class Solution {
    public int solution(int price) {
        int result = (int)Math.floor(price* 0.8);
        if(price < 100000){
            result = price;
        } else if(100000 <= price && price < 300000){
            result = (int)Math.floor(price* 0.95);
        } else if(300000 <= price && price < 500000){
            result = (int)Math.floor(price* 0.9);  
        }
        return result;
    }
}