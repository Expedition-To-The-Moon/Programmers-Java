import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int result = 0;
        // sides[1]이 가장 긴 변일 경우
        int min = sides[1]-sides[0]+1;
        for(int i=min; i<=sides[1]; i++){
            result++;
        }
        // 나머지 변이 가장 긴 변일 경우
        int plus = sides[1]+sides[0];
        for(int i= sides[1]+1; i<plus; i++){
            result++;
        }
        return result;
    }
}