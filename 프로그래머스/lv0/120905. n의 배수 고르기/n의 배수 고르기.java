class Solution {
    public int[] solution(int n, int[] numlist) {
        int cnt = 0;
        int[] arr = new int[numlist.length];
        
        for(int i=0; i<numlist.length; i++){
            if(numlist[i] % n == 0){
                arr[cnt] = numlist[i];
                cnt++;
            }            
        }
        
        int[] result = new int[cnt];
        for(int i=0; i<result.length; i++){
            result[i] = arr[i];        
        }
        return result;        
    }
}