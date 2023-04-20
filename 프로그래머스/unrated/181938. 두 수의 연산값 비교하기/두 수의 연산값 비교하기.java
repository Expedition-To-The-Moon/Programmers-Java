class Solution {
    public int solution(int a, int b) {
        int plus = Integer.parseInt((""+a)+(""+b));
        int multi = 2*a*b;
        int result = plus;
        
        if(plus < multi){
            result = multi;
        }
        return result;
    }
}