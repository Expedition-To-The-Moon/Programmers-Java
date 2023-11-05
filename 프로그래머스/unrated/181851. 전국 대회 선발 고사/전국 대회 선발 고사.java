import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int l = rank.length;
        List<Integer> able = new ArrayList<>();
        for(int i=0; i<l; i++){
            if(attendance[i] == true){
                able.add(rank[i]);
            }
        }
        
        Collections.sort(able);
        int a = 0;
        int b = 0;
        int c = 0;
        for(int j=0; j<rank.length; j++){
            if(able.get(0) == rank[j]){
                a = j;
            } else if(able.get(1) == rank[j]){
                b = j;
            } else if(able.get(2) == rank[j]){
                c = j;
            }
        }
        int result = 10000*a + 100*b + c;
        return result;
    }
}