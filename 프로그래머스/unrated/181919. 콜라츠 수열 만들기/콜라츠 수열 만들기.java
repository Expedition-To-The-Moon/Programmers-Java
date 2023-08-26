import java.util.*;

class Solution {
    public List solution(int n) {
        List<Integer>res = new ArrayList<>();
        res.add(n);
        while(n != 1){
            if(n%2 == 0){
                n = n / 2;
            } else{
                n = 3 * n + 1;
            }
            res.add(n);
        }
        return res;
    }
}