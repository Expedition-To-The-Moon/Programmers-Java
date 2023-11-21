import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List solution(String s) {
        String[] li = s.split("},");
        for(int i=0; i<li.length; i++){
            String s1 = li[i].replace("{","").replace("}","");
            li[i] = s1;
        }
        Arrays.sort(li,(a, b) -> Integer.compare(a.length(), b.length()));
       
        List<Integer> res = new ArrayList<Integer>();
        for(int i=0; i<li.length; i++){
            String[] s2 = li[i].split(",");
            for(int j=0; j<s2.length; j++){
                int k = Integer.parseInt(s2[j]);
                if(!res.contains(k)){
                    res.add(k);
                }
            }
        }
        return res;
    }
}