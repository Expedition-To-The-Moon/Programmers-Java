class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length;
        int idx = len/n +1;
        if(len%n == 0){
            idx = len/n;
        }
        int[] res = new int[idx];
        int j =0;
        for(int i=0; i<idx; i++){
            res[i] = num_list[j];
            j = j+n;
        }
        return res;
    }
}