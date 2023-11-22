import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> list = new Stack<>();
        int res = 0;
        for(int i=0; i<moves.length; i++){
            int m = moves[i]-1; 
            for(int j=0; j<board.length; j++){
                int n = board[j][m];
                if(n != 0){
                    if(!list.empty() && list.peek() == n){
                        list.pop();
                        res += 2;
                    } else {
                        list.push(n);
                    }
                    board[j][m] = 0;
                    break;
                }
            }
        }
        return res;
    }
}