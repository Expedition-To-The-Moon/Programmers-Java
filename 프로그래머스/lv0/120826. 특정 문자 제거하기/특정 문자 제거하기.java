class Solution {
    public String solution(String my_string, String letter) {
        String[] letStr = my_string.split(letter);
        String result = "";
        for (String word : letStr) {
             result += word;
        }
        return result;
    }
}