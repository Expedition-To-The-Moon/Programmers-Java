class Solution {
    public String solution(String my_string, String alp) {
        String[] list = my_string.split("");
        String res = "";
        for(String s : list){
            if(s.equals(alp)){
                s = s.toUpperCase();
                res += s;
            } else {
                res +=s;
            }
        }
        return res;
    }
}