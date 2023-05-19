class Solution {
    public String solution(String[] seoul) {
        String ans = "Kim";

        int ind = 0;
        for(String word : seoul){
            if(word.equals(ans)){
               break;
            }
            ind++;
        }
        return "김서방은 "+ ind +"에 있다";
    }
}