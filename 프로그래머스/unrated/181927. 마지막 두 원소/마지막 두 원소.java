class Solution {
    public int[] solution(int[] num_list) {
        int ind = num_list.length;
        int[] result = new int[ind+1];
        
        for(int i=0; i<ind; i++){
            result[i] = num_list[i];
        }
        
        if(num_list[ind-1]>num_list[ind-2]){
            result[ind] = num_list[ind-1] - num_list[ind-2];
        } else {
            result[ind] = num_list[ind-1]*2;
        }
        return result;
    }
}