class Solution {
    public int solution(int n) {
        int res = 0;
        String reThr = "";
        while(n != 0) {
            int div = n % 3;
            n = n / 3;
            reThr += ("" + div);
        }

        String[] li = reThr.split("");
        int l = li.length-1;
        int mul = 1;
        for(int i=l; i>=0; i--) {
            int num = Integer.parseInt(li[i]);
            if(num != 0) {
                int math = num * mul;
                res += math;
            } 
            mul *= 3;
        }
        return res;
    }
}