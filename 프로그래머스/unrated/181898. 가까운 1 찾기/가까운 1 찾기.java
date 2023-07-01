class Solution {
    public int solution(int[] arr, int idx) {
        int res = -1;
        for(int i= idx; i<arr.length; i++){
            if(arr[i] == 1){
                res = i;
                break;
            }
        }
        return res;
    }
}