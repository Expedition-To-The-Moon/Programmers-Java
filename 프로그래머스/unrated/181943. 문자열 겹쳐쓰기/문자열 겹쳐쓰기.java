class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String sb1 = my_string.substring(0, s);
        String sb2 = my_string.substring(s+overwrite_string.length(), my_string.length());
        String answer = sb1 + overwrite_string + sb2;
        return answer;
    }
}