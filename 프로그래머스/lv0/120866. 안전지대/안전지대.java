class Solution {
    public int solution(int[][] board) {
        int len = board.length;
        // 배열 복사
        int[][] copy = new int[len][len];
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                copy[i][j] = board[i][j];
            }
        }
        // 위험 지역 표시
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                if(board[i][j] == 1){
                    if(i<len-1) copy[i+1][j] = 1;
                    if(i>0) copy[i-1][j] = 1;
                    if(j<len-1) copy[i][j+1] = 1;
                    if(j>0) copy[i][j-1] = 1;
                    if(i<len-1 && j<len-1) copy[i+1][j+1] = 1;
                    if(i<len-1 && j>0) copy[i+1][j-1] = 1;
                    if(i>0 && j<len-1) copy[i-1][j+1] = 1;
                    if(i>0 && j>0) copy[i-1][j-1] = 1;
                } 
                
            }
        }        
        // 안전 지역 칸 수
        int result = len*len;
        for(int i=0; i<len; i++){
            for(int j : copy[i]){
            result -= j;
            }
        }
        return result;
    }
}