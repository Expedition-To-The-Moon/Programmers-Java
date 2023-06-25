class Solution {
    public String solution(String myString) {
        String res = "";
        for(int i=0; i<myString.length(); i++){
            char ch = myString.charAt(i);
            if((int)ch < 108) {
                res += "l"; 
            } else {
                String str = myString.substring(i,i+1);
                res += str;
            }
        }
        
        return res;
    }
}