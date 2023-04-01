class Solution {
    public String solution(String my_string) {
        String a = "";
        
        for(int i = (my_string.length()-1); i>=0; i--){ 
            a += my_string.substring(i,i+1);
        }
        return a;
    }
}
