class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String res = "";
        String id = id_pw[0];
        String pw = id_pw[1];
        
        for(String[] s : db){
            if(s[0].equals(id) && s[1].equals(pw)){
                res = "login";
                break;
            } else if(s[0].equals(id) && !s[1].equals(pw)){
                res = "wrong pw";
                break;
            } else {
                res = "fail";
            }
        }
        return res;
    }
}