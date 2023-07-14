import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        Arrays.sort(indices);
        String res = "";
        
        int idx = 0;
        for(int i=0; i<my_string.length(); i++){
            if(i != indices[idx]){
                String str = my_string.substring(i,i+1);
                res += str;
            } else {
                if(idx < indices.length-1){
                    idx++;
                }
            }
        }
        return res;
    }
}