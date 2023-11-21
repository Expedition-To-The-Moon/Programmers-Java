class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] res = new String[n];
        for(int i=0; i<n; i++){
            res[i] = Integer.toBinaryString(arr1[i]|arr2[i]);
            res[i] = String.format("%"+n+"s", res[i]);
            res[i] = res[i].replace("1","#");
            res[i] = res[i].replace("0"," ");
        }
        return res;
    }
}