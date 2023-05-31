import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] list = s.split(" ");
        int len = list.length;
        int[] nlist = new int[len];
        for(int i=0; i<len; i++){
            nlist[i] = Integer.parseInt(list[i]);
        }
        Arrays.sort(nlist);
        String min = Integer.toString(nlist[0]);
        String max = Integer.toString(nlist[len-1]);
        String res = min +" "+max;
        return res;
    }
}