class Solution {
    public String solution(String my_string, int num1, int num2) {
        String result = "";
        for(int i=0; i<my_string.length(); i++){
            char str = my_string.charAt(i);
            if(i == num1) {
                str = my_string.charAt(num2);
            } else if(i == num2){
                str = my_string.charAt(num1);
            }
            result += str;
        }
        
        return result;
    }
}