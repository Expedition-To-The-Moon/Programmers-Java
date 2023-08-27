class Solution {
    public int solution(int[] num_list) {
        int res = 0;
        for(int i=0; i<num_list.length; i++){
            int n = num_list[i];
            int cnt = 0;
            while(n != 1){
                if(n%2 == 0){ n = n/2; 
                } else { n = (n-1)/2;
                }
                cnt++;
            }
            res += cnt;
        }
        return res;
    }
}