class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] res = new int[num_list.length-n+1];
        
        
        for(int i=n-1; i<num_list.length; i++){
            res[i-n+1] = num_list[i];
        }
        return res;
    }
}