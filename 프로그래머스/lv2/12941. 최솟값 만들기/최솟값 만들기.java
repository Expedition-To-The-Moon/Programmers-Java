import java.util.Arrays;

class Solution{
    public int solution(int []A, int []B){
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);    
        
        int l = A.length;
        for(int i=0; i<l; i++){
            int mul = A[i]*B[l-1-i];
            answer += mul;
        }
        return answer;
    }
}