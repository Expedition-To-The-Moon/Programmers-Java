class Solution {
    public int solution(int[] arr) {
        int res = -1;
        int a = arr.length;
        int cnt = 0;
        while(res == -1){
            int idx = 0;
            for(int i=0; i<a; i++){
                if(arr[i]>=50 && arr[i]%2==0){
                    arr[i] /= 2;
                    idx++;
                } else if(arr[i]<50 && arr[i]%2==1){
                    arr[i] = arr[i]*2 + 1;
                    idx++;
                } 
            }
            cnt++;
            if(idx == 0){
                res = cnt-1;
            }
        }
        return res;
    }
}