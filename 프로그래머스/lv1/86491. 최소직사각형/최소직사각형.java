class Solution {
    public int solution(int[][] sizes) {
        int wBig = 0;
        int hBig = 0;
        
        for(int[] no : sizes){
            int w = Math.max(no[0], no[1]);
            int h = Math.min(no[0], no[1]);
            
            if(w > wBig){ wBig = w; }
            if(h > hBig){ hBig = h; }
        }
        int res = wBig * hBig;
        return res;
    }
}