class Solution {
    public String solution(int[] numLog) {
        String result = "";
        
        for(int i=0; i<numLog.length-1; i++){
            int num = numLog[i+1] - numLog[i];
            if(num == 1){
                result += "w";
            } else if(num == (-1)){
                result += "s";
            } else if(num == 10){
                result += "d";
            } else {
                result += "a";
            }
        }
        return result;
    }
}