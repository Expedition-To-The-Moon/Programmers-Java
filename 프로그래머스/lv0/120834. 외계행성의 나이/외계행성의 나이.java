class Solution {
    public String solution(int age) {
        String strAge = Integer.toString(age);
        String[] sum = new String[strAge.length()];
        String result = "";
        
        for(int i=0; i<strAge.length(); i++){
            char chAge = strAge.charAt(i);
            int num = (int)chAge + '1';
            char chNum = (char)num;
            result += Character.toString(chNum);
        }

        return result;
    }
}