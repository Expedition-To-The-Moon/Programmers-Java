class Solution {
    public int[] solution(int[] arr) {
        int[] li = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        int a = 0;
        for(int i=0; i<li.length; i++){
            if(arr.length <= li[i]){
                a = li[i];
                break;
            }
        }
        int[] result = new int[a];
        for(int i=0; i<a; i++){
            if(i >= arr.length){
                result[i] = 0;
            } else {
                result[i] = arr[i];
            }
        }
        return result;
    }
}