class Solution {
    public int[] solution(int n) {
        int[] Arr = new int[n];
        int cnt = 0;
        
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                Arr[cnt++] = i;
            }
        }
        
        int[] result = new int[cnt];
         
        for(int i=0; i<cnt; i++){
            result[i] = Arr[i];
        }
        return result;
    }
}