class Solution {
    public int solution(int num) {
        int res = 0;
        for(int i=0; i<500; i++){
            if(num == 1){ break;
            } else if(num%2 == 0) { num = num/2; res++; 
            } else if(num%2 == 1) { num = num*3 + 1; res++; }
        }
        if(num != 1){
            res = -1;
        }
        return res;
    }
}