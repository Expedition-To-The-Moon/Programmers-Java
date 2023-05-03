class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length();
        int index = (len%n == 0) ? len/n : len/n+1 ;
        String[] result = new String[index];
        
        for(int i=0; i<index-1; i++){
            int j = i*n;
            result[i] = my_str.substring(j, j+n);
            
        }
        result[index-1] = my_str.substring((index-1)*n, len);
        return result;
    }
}