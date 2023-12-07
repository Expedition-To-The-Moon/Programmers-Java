import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int m) {
        int[] res = new int[2];
        
        List<Integer> li = new ArrayList<>();
        int num = n<=m ? n : m;
        for(int i=1; i<=num; i++) {
            if(n%i == 0 && m%i == 0){
                li.add(i);
            } 
        }
        
        int last = li.size() - 1;
        int div = li.get(last);
        res[0] = div;
        res[1] = n * m / div;
        return res;
    }
}