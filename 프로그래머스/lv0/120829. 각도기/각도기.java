class Solution {
    public int solution(int a) {
        int result= 0;
        
        if(0<a && a<90){
            result = 1;
        } else if(a == 90){
            result = 2;
        } else if(90<a && a<180){
            result = 3;
        } else if(a == 180){
            result = 4;
        } 
         return result;
    }
}
