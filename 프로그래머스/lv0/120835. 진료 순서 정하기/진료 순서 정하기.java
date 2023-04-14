import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] list = Arrays.copyOf(emergency, emergency.length);
        int[] result = new int[emergency.length];

        Arrays.sort(emergency);

        for(int i=0; i<emergency.length; i++){
            for(int j=0; j<emergency.length; j++){
                if(list[i] == emergency[j]){
                    result[i] = emergency.length-j;
                }
            }
        }
        return result;
    }
}