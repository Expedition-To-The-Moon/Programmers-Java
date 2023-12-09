class Solution {
    public int solution(int n) {
        int res = 0;
        String one = Integer.toBinaryString(n);
        String re = one.replace("1", "");
        int num = one.length() - re.length();
        
        while(res == 0){
            n++;
            String next = Integer.toBinaryString(n);
            String ren = next.replace("1", "");
            if(num == next.length() - ren.length()) {
                res = n;
            }
        }
        return res;
    }
}