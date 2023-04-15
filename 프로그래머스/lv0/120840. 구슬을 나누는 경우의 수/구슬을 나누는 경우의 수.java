import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        int result = 1;

        BigInteger bj = BigInteger.ONE;
        BigInteger bm = BigInteger.ONE;
        
        if(balls != share){
            for(int i=1; i < balls-share+1; i++){
                bj = bj.multiply(BigInteger.valueOf(i+share));
                bm = bm.multiply(BigInteger.valueOf(i));

                result = bj.divide(bm).intValue();
            }
        }
        return result;
    }
}