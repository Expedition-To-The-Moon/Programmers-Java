class Solution {
    public int[] solution(int[] numbers, String direction) {
        int index = numbers.length-1;
        int[] result = new int[index + 1];

        for(int i=0; i < index; i++){
            if(direction.equals("right")){
                result[0] = numbers[index]; 
                result[index-i] = numbers[index-1-i];
            } else {
                result[index] = numbers[0];
                result[i] = numbers[i+1];
            }
        }   
        return result;
    }
}