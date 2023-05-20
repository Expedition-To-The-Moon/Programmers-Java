class Solution {
    public String solution(String phone_number) {
        String res = "";
        int ind = phone_number.length();
        for(int i=0; i<ind-4; i++){
            res += "*";
        }
        res += phone_number.substring(ind-4,ind);
        return res;
    }
}