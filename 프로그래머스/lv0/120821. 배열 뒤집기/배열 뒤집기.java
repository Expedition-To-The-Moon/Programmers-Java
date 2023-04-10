class Solution {
    public int[] solution(int[] num_list) {
        int[] result = new int[num_list.length];
        int j = 0; 
        for(int i= num_list.length-1 ; 0 <= i; i--){
            result[i] = num_list[j];
            j++;
        }
        return result;
    }
}