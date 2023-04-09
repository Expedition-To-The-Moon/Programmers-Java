class Solution {
    public int solution(int order) {
        int result = 0;
        String odStr = Integer.toString(order);
        for(int i=0; i<odStr.length(); i++){
            char odch = odStr.charAt(i);
            if((odch%3 == 0) && (odch != '0')){
                result++;
            }
        }
        return result;
    }
}