class Solution {
    public int solution(int[] common) {
        int result = 0;
        int n = common.length - 1;
        
        if((common[1]-common[0]) == (common[2]-common[1])){
            result = common[n] + (common[1]-common[0]);
        } else{
            result = common[n] * (common[1]/common[0]);
        }
        return result;
    }
}