class Solution {
    public int[][] solution(int n) {
        int[][] res = new int [n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j){
                    res[i][j] = 1;
                } else{
                    res[i][j] = 0;
                }
            }
        }
        return res;
    }
}