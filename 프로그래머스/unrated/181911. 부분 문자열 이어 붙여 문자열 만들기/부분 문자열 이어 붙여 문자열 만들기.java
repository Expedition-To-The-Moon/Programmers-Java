class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String res = "";
        for(int i=0; i<my_strings.length; i++){
           res += my_strings[i].substring(parts[i][0],parts[i][1]+1);
        }
        return res;
    }
}