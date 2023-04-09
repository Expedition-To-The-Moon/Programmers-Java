class Solution {
    public int solution(int[] array) {
        int result = 0;
        int[] cntArr = new int[1000];
        int max = 0;
       
        for(int i=0; i<array.length; i++){  
        	cntArr[array[i]]++;
        }
        
        for(int i=0; i<cntArr.length; i++){
            if(cntArr[i] > max) {
                max = cntArr[i];
                result = i;
           } else if(cntArr[i] == max){
                result = -1;
            }
        }
         return result;
    }
}
