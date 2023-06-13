class Solution {
    public String solution(String my_string, int[] index_list) {
        String[] list = my_string.split("");
        String res = "";
        for(int i : index_list){
            res += list[i];
        }
        return res;
    }
}