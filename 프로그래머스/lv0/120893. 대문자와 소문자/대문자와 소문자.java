class Solution {
    public String solution(String my_string) {
        String result = "";
        for(int i=0; i<my_string.length(); i++){
            char mych = my_string.charAt(i);
            int Uni = (int) mych;
            if(65 <= mych && mych <=90){
                Uni = (int) mych + 32;
            } else {
                Uni = (int) mych - 32;
            }
            char ch = (char)Uni;
            result += ch;
        }
        return result;
    }
}