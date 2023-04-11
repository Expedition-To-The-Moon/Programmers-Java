import java.util.Arrays; 

class Solution {
    public int[] solution(String my_string) {
        int[] sum = new int[my_string.length()];
        int index = 0;
       
        for(int i = 0; i< my_string.length(); i++){
            char Uni = my_string.charAt(i);
            int numUni = (int)Uni -'0';
            if(0 <= numUni && numUni <=9){
                sum[index] = numUni;
                index++; 
            }
        }

        int[] result = new int[index];

        for(int i=0; i < index; i++){
            result[i] = sum[i];
        }
        Arrays.sort(result);
        return result;
        
    }
}