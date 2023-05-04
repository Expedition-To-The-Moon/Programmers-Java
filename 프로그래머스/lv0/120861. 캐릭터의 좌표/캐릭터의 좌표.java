class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int ix = board[0]/2;
        int iy = board[1]/2;
        
        for(int i=0; i<keyinput.length; i++){
            if(keyinput[i].equals("left") || keyinput[i].equals("right")){
                answer[0] += keyinput[i].equals("left") ? -1 : +1 ;
                if(Math.abs(answer[0]) > ix){
                    answer[0] = answer[0] < 0 ? -ix : ix;
                }
            } else {
                answer[1] += keyinput[i].equals("down") ? -1 : +1 ;
                if(Math.abs(answer[1]) > iy){
                    answer[1] = answer[1] < 0 ? -iy : iy;
                }
            }
        }
        return answer;
    }
}