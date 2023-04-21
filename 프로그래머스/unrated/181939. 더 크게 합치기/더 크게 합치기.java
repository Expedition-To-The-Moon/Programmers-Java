class Solution {
    public int solution(int a, int b) {
        int iA = Integer.parseInt(("" + a)+("" + b));
        int iB = Integer.parseInt(("" + b)+("" + a));
        int result = iA;
        
        if(iA < iB){
            result = iB;
        }
        return result;
    }
}