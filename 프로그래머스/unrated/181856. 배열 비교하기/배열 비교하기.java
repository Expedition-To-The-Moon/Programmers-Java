class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int res = 1;
        int l1 = arr1.length;
        int l2 = arr2.length;
        
        if(l2 > l1){
            res = -1;
        } else if(l2 == l1){
            int sum1 = 0;
            int sum2 = 0;
            for(int i : arr1){ sum1 += i; }
            for(int i : arr2){ sum2 += i; }
            if(sum2 > sum1){ res = -1;
            } else if(sum1 == sum2){
                res = 0;
            }
        }
        
        return res;
    }
}