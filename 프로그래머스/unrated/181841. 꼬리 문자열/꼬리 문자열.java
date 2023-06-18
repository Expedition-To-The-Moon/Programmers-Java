class Solution {
    public String solution(String[] str_list, String ex) {
        String res = "";
        for(String str : str_list){
            if(!str.contains(ex)){
                res += str;
            }
        }
        return res;
    }
}