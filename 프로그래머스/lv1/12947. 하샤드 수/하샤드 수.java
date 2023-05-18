class Solution {
    public boolean solution(int x) {
        boolean res = true;
        String str = Integer.toString(x);
        
        int sum = 0;
        for(int i=0; i<str.length(); i++){
            sum += str.charAt(i) - '0';
        }
        
        if((double)x%sum != 0){
            res = false;
        }
        return res;
    }
}