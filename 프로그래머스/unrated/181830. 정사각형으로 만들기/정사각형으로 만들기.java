import java.util.Arrays;

class Solution {
    public int[][] solution(int[][] arr) {
        int n1 = arr.length;
        int n2 = arr[1].length;
        
        int l = 0;
        if(n1>n2){ l = n1; 
        } else{ l = n2;
        }
        
        int[][] res = new int[l][l];
        for(int i=0; i<l; i++){
           Arrays.fill(res[i], 0);
        }

        for(int i=0; i<n1; i++){
            for(int j=0; j<n2; j++){
                res[i][j] = arr[i][j];
            }
        }
        return res;
    }
}