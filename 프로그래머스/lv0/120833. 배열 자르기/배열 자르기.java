class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int arr = num2-num1+1;
        int[] result = new int[arr];
        for(int i =0; i < arr; i++){
            result[i] = numbers[num1+i];
        }
        return result;
    }
}