import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int start, int end) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i=start; i>=end; i--){
            res.add(i);
        }
        return(res);
    }
}