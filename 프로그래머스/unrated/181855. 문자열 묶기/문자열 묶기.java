import java.util.Arrays;

class Solution {
    public int solution(String[] strArr) {
        int res = 0;
        int[] li = new int[100000];
        for(int i=0; i<strArr.length; i++){
            int len = strArr[i].length();
            li[len]++;
        }
        Arrays.sort(li);
        return res = li[li.length-1];
    }
}