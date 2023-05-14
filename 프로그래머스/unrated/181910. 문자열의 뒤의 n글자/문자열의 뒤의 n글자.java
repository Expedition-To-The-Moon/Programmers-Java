class Solution {
    public String solution(String my_string, int n) {
        int ind = my_string.length();
        String res = my_string.substring(ind-n,ind);
        return res;
    }
}