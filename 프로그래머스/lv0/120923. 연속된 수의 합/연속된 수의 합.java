class Solution {
    public int[] solution(int num, int total) {
        int[] arr = new int[num];
        int i = 0 ;
        int j = 0 ;
        if(total%num == 0){
            i = ((total/num) - (num/2));
            for(int k = i; k <(i+num); k++){
                arr[j++] = k;
            }
        } else {
            i = ((total/num) - (num/2 -1));
            for(int k = i; k <(i+num); k++){
                arr[j++] = k;
            }
        }
        return arr;
    }
}
