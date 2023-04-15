class Solution {
    public int solution(int i, int j, int k) {
         String kstr =Integer.toString(k);
        int result = 0;
        
        for(; i <= j; i++){
            String istr =Integer.toString(i);
            String remain = istr.replace(kstr, "");
            if(istr.length() != remain.length()){
                result += istr.length()-remain.length() ;
            }
        }
        return result;
    }
}