import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int cnt = commands.length;
        int[] res = new int[cnt];
        for(int c=0; c<cnt; c++){
            int i = commands[c][0] - 1;
            int j = commands[c][1];
            int k = commands[c][2] - 1;
            
            int[] arr = Arrays.copyOfRange(array, i, j);
            Arrays.sort(arr);
            res[c] = arr[k];
        }
        return res;
    }
}