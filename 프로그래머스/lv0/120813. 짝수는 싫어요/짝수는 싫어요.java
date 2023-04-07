class Solution {
    public int[] solution(int n) {
        int[] arr = new int[n];
        int k = 0; 
        for(int i=0; i<=arr.length; i++){
            if(!(i%2==0)){
                arr[k] = i;
                k++;
            }
        }
        
        int[] result = new int[k];
        for(int i=0; i<result.length; i++){
                result[i] = arr[i];
        }
        return result;
    }
}