class Solution {
    public String solution(String myString) {
        String res = "";
        myString = myString.toLowerCase();
        String[] list = myString.split("");
        for(int i=0; i<list.length; i++){
            if(list[i].equals("a")){
                res += "A";
            } else{
                res += list[i];
            }
        }
        return res;
    }
}