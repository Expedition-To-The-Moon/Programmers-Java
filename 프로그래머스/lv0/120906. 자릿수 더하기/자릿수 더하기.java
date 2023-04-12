class Solution {
    public int solution(int n) {
        int result = 0;
        String num = Integer.toString(n);
        
        for(int i =0; i<num.length(); i++){
            int a = num.charAt(i) - '0';
            result += a;
        }
        return result;
    }
}