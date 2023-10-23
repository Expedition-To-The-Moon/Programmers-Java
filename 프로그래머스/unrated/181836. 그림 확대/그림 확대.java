import java.util.List;
import java.util.ArrayList;

class Solution {
    public List solution(String[] picture, int k) {
        List<String> res = new ArrayList<>();
        
        for (int i = 0; i < picture.length; i++) {
            String[] li = picture[i].split("");
            String str = "";
            for (int j = 0; j < li.length; j++) {
                str += li[j].repeat(k);
            }
            for (int j = 0; j < k; j++) {
                res.add(str);
            }
        }
        return res;
    }
}