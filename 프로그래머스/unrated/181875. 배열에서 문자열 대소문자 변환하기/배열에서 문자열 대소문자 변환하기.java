class Solution {
    public String[] solution(String[] strArr) {
        String[] res = new String[strArr.length];
        for(int i=0; i<strArr.length; i++){
            String s = strArr[i];
            if(i%2 ==0){
                res[i] = s.toLowerCase();
            } else {
                res[i] = s.toUpperCase();
            }
        }
        return res;
    }
}