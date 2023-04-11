class Solution {
    public int solution(int[] box, int n) {
        int result = 1;
        int num = 0;
        for(int i=0; i<box.length; i++){
            num = box[i] / n;
            result *= num;
        }
        return result;
    }
}