class Solution {
    public StringBuilder solution(String my_string, int[][] queries) {
        StringBuilder res = new StringBuilder(my_string);
        
        for(int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            
            StringBuilder se = new StringBuilder(res.substring(s, e+1));
            se.reverse();
            res.replace(s, e+1, se.toString());
        }
        return res;
    }
}