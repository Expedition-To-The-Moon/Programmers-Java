class Solution {
    public String solution(int q, int r, String code) {
        String result = "";
        int c = code.length();
        for(int i=0; i<c; i++){
            if(i%q == r){ 
                String s = code.substring(i, i+1);
                result += s;
            }
        }
        return result;
    }
}