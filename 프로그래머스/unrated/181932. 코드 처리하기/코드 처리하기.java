class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        
        for(int i=0;i<code.length(); i++){
            String word = code.substring(i, i+1);
            if(word.equals("1")){
                mode++;        
            } else {
                if(mode%2 == 0 && i%2 ==0){
                    ret += word;
                } else if(mode%2!= 0 && i%2 !=0){
                    ret += word;
                }
            }
        }
        return ret = (ret.length() == 0) ? "EMPTY" : ret;
    }
}