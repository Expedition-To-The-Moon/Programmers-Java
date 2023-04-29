class Solution {
    public int solution(int[] numbers, int k) {
        int result = numbers[(k-1)*2%numbers.length];
        if((k-1)*2 < numbers.length){
            result = numbers[(k-1)*2];
        }
        return result;
    }
}