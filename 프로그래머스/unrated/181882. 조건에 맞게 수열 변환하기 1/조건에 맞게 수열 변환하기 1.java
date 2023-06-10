class Solution {
    public int[] solution(int[] arr) {
        int[] res = new int[arr.length];
        int idx = 0;
        for(int i : arr){
            if(i >= 50 && i%2 == 0){
                res[idx] = i/2;
                idx++;
            } else if(i <= 50 && i%2 == 1){
                res[idx] = i*2;
                idx++;
            } else{
                res[idx] = arr[idx];
                idx++;
            }
        }
        return res;
    }
}