class Solution {
    public int[] solution(String s) {
        int[] res = new int[2];
        while(!s.equals("1")){
            int prelen = s.length();
            s = s.replace("0","");
            int len = s.length();
            s = Integer.toBinaryString(len);
            res[1] += (prelen - len); 
            res[0]++;
        }
        return res;
    }
}