class Solution {
    public int solution(int[] array) {
        int result = 0;
        if(1<=array.length && array.length<=100){
            for(int i=0; i< array.length; i++){
                String s = Integer.toString(array[i]);
                String[] arr = s.split("");
                for(int k=0; k< arr.length; k++){
                    if(arr[k].equals("7")){
                        result++;
                    }
                }
            }
        }
        return result;
    }
}