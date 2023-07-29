class Solution {
    public String solution(String a, String b) {
        String res = "";
        String sum = "";
        int alen = a.length();
        int blen = b.length();
        int len = alen >= blen ? alen : blen;
        int j = 0;
        for(int i=0; i<len; i++){
            int a1 = 0;
            int b1 = 0;
            if(i>alen-1){
                a1 = 0;
                b1 = Integer.parseInt(b.substring(blen-1-i, blen-i));
            } else if(i>blen-1){
                a1 = Integer.parseInt(a.substring(alen-1-i, alen-i));
                b1 = 0;
            } else{
                a1 = Integer.parseInt(a.substring(alen-1-i, alen-i));
                b1 = Integer.parseInt(b.substring(blen-1-i, blen-i));
            }
            int sum1 = a1 + b1 + j;
            if(sum1 >= 10){
                j = 1;
                sum += (sum1-10);
            } else{
                j = 0;
                sum += sum1;
            }
        }
        res = j == 0 ? res : (res += j);
        for(int i=0; i<sum.length(); i++){
            String s = sum.substring(len-1-i, len-i);    
            res += s;
        }
        return res;
    }
}