class Solution {
    public int solution(int[] num_list) {
        int result = 0;
        int multi =1;
        int sum = 0;
        
        for(int i=0; i<num_list.length; i++){
            multi *= num_list[i];
            sum += num_list[i];
        }
        return result = (multi > sum*sum) ? 0 : 1;
    }
}