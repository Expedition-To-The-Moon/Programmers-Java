import java.util.Arrays;

class Solution {
    public int solution(String[] order) {
        int res = 0;
        String[] ame = new String[]{"iceamericano", "americanoice","hotamericano", "americanohot", "americano", "anything"};
        for(String s : order){
            if(Arrays.asList(ame).contains(s)){
                res += 4500;
            } else {
                res += 5000;
            }
        }
        return res;
    }
}