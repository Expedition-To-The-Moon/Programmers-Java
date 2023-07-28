class Solution {
    public int[] solution(String my_string) {
        int[] res = new int[52];
        for(int i=0; i<my_string.length(); i++){
            char ch = my_string.charAt(i);
            if(65<=ch && ch<=90){
                res[ch-65] += 1; 
            } else{
                res[ch-71] += 1;
            }
        }
        return res;
    }
}