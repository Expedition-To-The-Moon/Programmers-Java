class Solution {
    public String solution(String n_str) {
        String res = "";
        String[] list = n_str.split("");
        int idx = 0;
        for(int i=0; i<list.length; i++){
            if(!list[i].equals("0")){
                idx = i;
                break;
            }
        }
        
        for(int i= idx; i<list.length; i++){ res += list[i]; }
        return res;
    }
}