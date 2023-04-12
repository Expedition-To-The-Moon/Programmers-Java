class Solution {
    public int solution(int num, int k) {
        int result = -1;
        String strNum = Integer.toString(num);
        
        for(int i=0; i<strNum.length(); i++){
            char chNum = strNum.charAt(i);
            int iNum = (int)chNum-'0';
            if(iNum == k){
                result = i+1;
                break;
            } 
        }
        return result;
    }
}