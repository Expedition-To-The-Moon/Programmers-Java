class Solution {
    public int solution(int[] num_list) {
        int result = 0;
        String odd = "";
        String even = "";
        
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2 != 0){
                odd += (""+num_list[i]);
            } else {
                even += (""+num_list[i]);
            }
        }
        
        int iodd = Integer.parseInt(odd);
        int ieven = Integer.parseInt(even);
        
        return result = iodd + ieven;
    }
}