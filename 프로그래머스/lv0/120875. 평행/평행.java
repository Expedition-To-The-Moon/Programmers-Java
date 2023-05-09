import java.util.ArrayList;

class Solution {
    public int solution(int[][] dots) {
        int res =0;

        ArrayList<Integer> xlist = new ArrayList<Integer>();
        ArrayList<Integer> ylist = new ArrayList<Integer>();

        for(int i=0; i<dots.length-1; i++){
            for(int j=i+1; j<dots.length; j++){
                // x축
                xlist.add(dots[i][0] - dots[j][0]);
                // y축
                ylist.add(dots[i][1] - dots[j][1]);
            }
        }

        int ind = xlist.size()-1;
        for(int i=0; i<dots.length; i++){
            if((double)xlist.get(i)/ylist.get(i) == (double)xlist.get(ind-i)/ylist.get(ind-i)){
                res = 1;
            }
        }
        return res;
    }
}