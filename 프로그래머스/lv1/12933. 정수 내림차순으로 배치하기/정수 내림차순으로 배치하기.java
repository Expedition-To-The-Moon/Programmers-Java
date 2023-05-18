import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String str = Long.toString(n);

        char[] list = new char[str.length()];
        for(int i=0; i<str.length(); i++){
            list[i] = str.charAt(i);
        }
        Arrays.sort(list);

        String plus = ""; 
        for(int i=str.length()-1; i>=0; i--){
            plus += list[i];
        }

        long res = Long.parseLong(plus);
        return res;
    }
}