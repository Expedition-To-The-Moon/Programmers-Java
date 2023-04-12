import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String result = "";
        String low = my_string.toLowerCase();
        String[] arr = new String[low.length()];
        
        for(int i =0; i<low.length(); i++){
            arr[i] = low.substring(i,i+1);
        }
        Arrays.sort(arr);
        for(String word : arr){
            result += word;
        }
        return result;
    }
}