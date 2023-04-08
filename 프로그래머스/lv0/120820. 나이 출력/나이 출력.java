class Solution {
    public int solution(int age) {
        int result=0;
        if(0<age && age<=120){
            result= 2022 - age + 1 ;
        }
        return result;
    }
}