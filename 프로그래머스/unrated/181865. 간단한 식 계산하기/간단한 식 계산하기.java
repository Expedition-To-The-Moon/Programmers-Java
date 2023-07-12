class Solution {
    public int solution(String binomial) {
        String[] list = binomial.split(" ");
        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[2]);
        
        int res = 0;
        if(list[1].equals("+")){
            res = a+b;
        } else if(list[1].equals("-")){
            res = a-b;
        } else {
            res = a*b;
        }
        return res;
    }
}