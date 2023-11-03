class Solution {
    public int solution(int chicken) {
        int result = 0;
        int cp = 0;
        
        while(true){
            cp = chicken/10;
            chicken = chicken%10 + cp;
            result += cp;
            if(chicken < 10){
                break;
            }
        }
        return result;
    }
}