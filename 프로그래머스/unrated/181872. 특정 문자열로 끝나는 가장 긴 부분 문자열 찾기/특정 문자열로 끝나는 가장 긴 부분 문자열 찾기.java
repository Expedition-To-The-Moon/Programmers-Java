class Solution {
    public String solution(String myString, String pat) {
        String result = "";
        int m = myString.length();
        int p = pat.length();
        for(int i=m; i>=p; i--){
            String s = myString.substring(i-p, i);
            if(s.equals(pat)){
                result = myString.substring(0, i);
                break;
            }
        }
        return result;
    }
}