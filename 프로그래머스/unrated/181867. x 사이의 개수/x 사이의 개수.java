import java.util.*;

class Solution {
    public int[] solution(String myString) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        int cnt = 0;
        for(int i=0; i<myString.length(); i++){
            char ch = myString.charAt(i);
            if(ch != 'x'){
                cnt++;
            } else {
                list.add(cnt);
                cnt = 0;
            }
        }
        list.add(cnt);
        
        int[] res = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
}