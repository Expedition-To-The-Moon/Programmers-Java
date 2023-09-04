class Solution {
    public int solution(String myString, String pat) {
        int res = 0;
        int sLen = myString.length();
        int pLen = pat.length();
        for(int i=0; i<sLen-pLen+1; i++){
            String str = myString.substring(i,i+pLen);
            if(str.equals(pat)){
                res++;
            }
        }
        return res;
    }
}