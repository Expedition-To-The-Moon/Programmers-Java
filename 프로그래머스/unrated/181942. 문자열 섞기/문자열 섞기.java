class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        for(int i=0; i< str1.length(); i++){
            String s1 = str1.substring(i,i+1);
            String s2 = str2.substring(i,i+1);
            answer += (s1+s2);
        }
        return answer;
    }
}