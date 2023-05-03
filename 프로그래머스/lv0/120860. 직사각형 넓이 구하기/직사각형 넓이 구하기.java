class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int x1 = dots[0][0];
        int y1 = dots[0][1];
        for(int i =1; i<4; i++){ 
            int x2 = dots[i][0];
            int y2 = dots[i][1];
            if((x1 != x2)&&(y1 != y2)){
                answer = Math.abs((x1-x2)*(y1-y2));
                break;
            } 
        }
        return answer;
    }
}