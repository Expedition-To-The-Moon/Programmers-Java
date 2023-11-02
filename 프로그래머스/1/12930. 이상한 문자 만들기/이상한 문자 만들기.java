class Solution {
    public String solution(String s) {
        String[] list = s.split(" ",-1);
        String res = "";
        int cnt = 0;
        for(String str : list){
            for(int i=0; i<str.length(); i++){
                String w = str.substring(i,i+1);
                if(i%2 ==0){
                    res += w.toUpperCase();
                } else {
                    res += w.toLowerCase();
                }
            }
            cnt++;
            if(cnt < list.length){
              res += " ";
            }
        }
        return res;
    }
}