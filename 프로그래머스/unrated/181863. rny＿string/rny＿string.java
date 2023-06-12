class Solution {
    public String solution(String rny_string) {
        String res = "";
        String[] list = rny_string.split("");
        for(String s : list) {
            if(s.equals("m")){
                res += "rn";
            } else {
                res += s;
            }
        }
        return res;
    }
}