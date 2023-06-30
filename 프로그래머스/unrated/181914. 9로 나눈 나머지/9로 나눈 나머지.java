class Solution {
    public int solution(String number) {
        String[] list = number.split("");
        int sum = 0;
        for(String s : list){
            sum += Integer.parseInt(s); 
        }
        int res = sum % 9;
        return res;
    }
}