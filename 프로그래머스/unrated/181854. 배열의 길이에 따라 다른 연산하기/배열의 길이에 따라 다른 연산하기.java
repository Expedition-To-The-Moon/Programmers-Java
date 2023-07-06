class Solution {
    public int[] solution(int[] arr, int n) {
        int len = arr.length;
        int[] res = new int[len];
        for(int i=0; i<len; i++){
            res[i] = arr[i];
            if(len%2 == 1){
                if(i%2 == 0){ res[i] += n; }
            } else {
                if(i%2 == 1){ res[i] += n; }
            }
        }
        return res;
    }
}