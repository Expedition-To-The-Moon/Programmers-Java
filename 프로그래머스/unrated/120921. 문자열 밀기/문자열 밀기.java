class Solution {
    public int solution(String A, String B) {
        int result = 0;
        int l = A.length();
        for(int i=0; i< l; i++){
            if(A.equals(B)){
                return result;
            }
            String a = A.substring(l-1);
            A = a + A.substring(0, l-1);
            result++;            
        }
        return -1;
    }
}