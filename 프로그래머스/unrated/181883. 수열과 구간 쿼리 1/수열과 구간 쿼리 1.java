class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] res = arr;
        for(int[] a : queries){
            for(int i=a[0]; i<=a[1]; i++){
                res[i] += 1;
            }
        }
        return res;
    }
}