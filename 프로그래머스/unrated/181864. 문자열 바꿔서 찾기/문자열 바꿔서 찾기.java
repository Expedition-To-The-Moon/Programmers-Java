class Solution {
    public int solution(String myString, String pat) {
        int res = 0;
        String[] list = pat.split("");
        String rePat = "";
        for(String s : list){
            if(s.equals("A")){
                rePat += "B";
            } else{
                rePat += "A";
            }
        }
        if(myString.contains(rePat)){
            res = 1;
        }
        return res;
    }
}