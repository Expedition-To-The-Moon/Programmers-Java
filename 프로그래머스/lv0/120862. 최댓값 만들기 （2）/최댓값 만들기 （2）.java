import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int result = 0;
        Arrays.sort(numbers);
        
        int max = numbers.length-1;
        int min = numbers[0];
        int plus = numbers[max];

        if(numbers[1] < 0){
            result = (min*(-1) < plus) ? plus*numbers[max-1] : min*numbers[1];
        } else {
            result = plus*numbers[max-1];
        }
        return result;
    }
}