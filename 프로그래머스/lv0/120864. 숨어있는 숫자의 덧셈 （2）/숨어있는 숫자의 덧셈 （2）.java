class Solution {
    public int solution(String my_string) {
        int result = 0;
        String[] str = my_string.split("[a-zA-Z]");
        for(int i=0; i<str.length; i++){
            result += !str[i].isEmpty() ? Integer.parseInt(str[i]) : 0;
        }
        return result;
    }
}