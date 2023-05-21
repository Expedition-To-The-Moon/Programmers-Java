class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        int ind = 0;
        for(boolean b : signs){
            if(b == true){
                sum += absolutes[ind];
                ind++;
            } else {
                sum -= absolutes[ind];
                ind++;
            }
        }
        return sum;
    }
}