class Solution {
    public int solution(String t, String p) {
        int res = 0;
        int pp = p.length();
        int l = t.length() - pp + 1;
        Long ps = Long.parseLong(p);
        for(int i=0; i<l; i++){
            String s = t.substring(i, i + pp);
            Long ts = Long.parseLong(s);
            if(ts <= ps){
                res++;
            }
        }
        return res;
    }
}