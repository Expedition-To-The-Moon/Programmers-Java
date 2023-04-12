class Solution {
    public int solution(String my_string) {
        int result = 0;
        for(int i=0; i< my_string.length(); i++){
            char mych = my_string.charAt(i);
            int Uni = (int) mych-'0';
            if(0 <= Uni && Uni <= 9){
                result += Uni;
            }
        }
        return result;
    }
}