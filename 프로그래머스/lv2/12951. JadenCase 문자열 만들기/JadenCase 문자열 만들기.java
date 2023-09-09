class Solution {
    public String solution(String s) {
        String rt = "";
        String[] list = s.toLowerCase().split(" ");
        for(int i=0; i<list.length; i++){
            if(!list[i].equals("")){
                String sb = list[i].substring(0,1).toUpperCase();
                String sb1 = list[i].substring(1,list[i].length());
                rt += sb + sb1;
                if(list[i] != list[list.length-1]){
                    rt += " ";
                }
            } else {
                rt += " ";
            }
        }
        while(s.length() != rt.length()){
            rt += " ";
        }
        return rt;
    }
}