import java.util.*;

class Solution {
    public List solution(int l, int r) {
        List<Integer> res = new ArrayList<>();
        
        for(int i=l; i<=r; i++){
            String s = i + "";
            if(s.contains("5")){
                String[] str = s.split("");
                int cnt = str.length;
                for(int j=0; j<cnt; j++){
                    String w = str[j];
                    if(w.equals("5") || w.equals("0")){
                        if(j == cnt-1){
                            int num = Integer.parseInt(s);
                            res.add(num);
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        if(res.size() == 0){
            res.add(-1);
        }
        return res;
    }
}