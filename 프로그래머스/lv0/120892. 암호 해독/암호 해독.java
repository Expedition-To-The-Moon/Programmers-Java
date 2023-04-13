class Solution {
    public String solution(String cipher, int code) {
        String result = "";
        int repeat = cipher.length()/code;
        for(int i = 1; i<= repeat; i++){
            result += cipher.charAt(i*code -1);
        }
        return result;
    }
}