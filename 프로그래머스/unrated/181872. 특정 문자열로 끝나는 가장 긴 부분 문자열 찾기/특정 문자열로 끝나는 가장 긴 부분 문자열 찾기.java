class Solution {
    public String solution(String myString, String pat) {
        String result = "";
        int idx = myString.lastIndexOf(pat);
        int p = pat.length();
        result = myString.substring(0,idx+p);
        return result;
    }
}