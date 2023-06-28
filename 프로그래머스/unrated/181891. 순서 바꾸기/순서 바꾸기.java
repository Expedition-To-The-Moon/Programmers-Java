class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length;
        int[] res = new int[len];
        for(int i=n; i<len; i++){
            res[i-n] = num_list[i];
        } 
        for(int i=len-n; i<len; i++){
            res[i] = num_list[i-len+n];
        }
        return res;
    }
}