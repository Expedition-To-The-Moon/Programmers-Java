class Solution {
    public String solution(String my_string, int m, int c) {
        String res = "";
        String[] list = my_string.split("");
        int cnt = 0;
        for(int i=0; i<list.length; i++){
            if(i == m*cnt+c-1){
                cnt++;
                res += list[i];
            }
        }
        return res;
    }
}