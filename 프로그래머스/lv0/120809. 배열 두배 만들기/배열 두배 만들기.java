class Solution {
    public int[] solution(int[] numbers) {
        int[] result = new int[numbers.length];
        for(int i=0; i<numbers.length; i++){
            int a = numbers[i];
            result[i] = a*2;
        }
        return result;
    }
}