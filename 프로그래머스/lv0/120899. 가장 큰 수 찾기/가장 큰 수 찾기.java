
class Solution {
    public int[] solution(int[] array) {
        int[] result = new int[2];
        int max = 0;
        
        for(int i=0; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
                result[0] = max;
                result[1] = i;
            }
        }
        return result;
    }
}