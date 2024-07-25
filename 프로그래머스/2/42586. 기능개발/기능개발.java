import java.util.*;

class Solution {
    public List solution(int[] progresses, int[] speeds) {
        int len = progresses.length;
        ArrayList<Integer> res = new ArrayList<>();
        
        Stack<Integer> st = new Stack<>();
        for (int i = len - 1; i >= 0; i--) {
            st.push(progresses[i]);
        }
        
        int num = 0;
        int day = 0;
        for (int i = 0; i < len; i++) {
            int pro = st.pop();
            if (day != 0) pro += speeds[i] * day;
            
            if (pro >= 100) { 
                num++;
            } else if (pro < 100 && num != 0){
                res.add(num);
                day += (int) Math.ceil((double)(100 - pro) / speeds[i]);
                num = 1;
            } else {
                day += (int) Math.ceil((double)(100 - pro) / speeds[i]);
                num++;
            }
        }
        if (num != 0) res.add(num);
        return res;
    }
}