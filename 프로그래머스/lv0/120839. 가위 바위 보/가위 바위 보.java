class Solution {
    public String solution(String rsp) {
        String result= "";
        
        for(int i=0; i<rsp.length(); i++){
            char num = rsp.charAt(i);
            if(num == '2'){
                result += "0";
            } else if(num == '0'){
                 result += "5";
            } else {
                 result += "2";
            }            
        }
        return result;
    }
}