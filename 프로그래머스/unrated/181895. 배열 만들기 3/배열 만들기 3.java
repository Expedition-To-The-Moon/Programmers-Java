class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int l1 = intervals[0][0];
        int l2 = intervals[0][1];
        int l3 = intervals[1][0];
        int l4 = intervals[1][1];
        
        int[] res = new int[l2-l1+l4-l3+2];
        int n = 0;
        for(int i=l1; i<=l2; i++){
            res[n] = arr[i];
            n++;
        }
        
        for(int i=l3; i<=l4; i++){
            res[n] = arr[i];
            n++;
        }
        return res;
    }
}