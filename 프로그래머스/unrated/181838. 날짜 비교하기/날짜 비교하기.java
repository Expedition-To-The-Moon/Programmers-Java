class Solution {
    public int solution(int[] date1, int[] date2) {
        int res = 0;
        for(int i=0; i<=2; i++){
            if(date1[i]>date2[i]){
                res = 0;
                break;
            } else if(date1[i]<date2[i]){
                res = 1;
                break;
            } 
        }
        return res;
    }
}