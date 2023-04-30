class Solution {
    public int[] solution(int n) {
        int[] numlist = new int[n];
        int num = 2;      
        int index = 0;

        while(n >= 2){
            if(n % num == 0){
                n = n / num;
                numlist[index] = num;
                if(n%num != 0){ index++; }
            } else { num++; }
        }

        int[] result = new int[index];
        for(int i=0; i<index; i++){
            result[i] = numlist[i];
        }
        return result;
    }
}