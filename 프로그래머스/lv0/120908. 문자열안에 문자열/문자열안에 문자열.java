class Solution {
    public int solution(String str1, String str2) {
        int result = 2;
        
            for(int i=0; i<str1.length()-str2.length()+1; i++){
                String part = str1.substring(i, i+str2.length());
                if(part.equals(str2)){
                    result = 1;
                }
            }
        return result;
    }
}