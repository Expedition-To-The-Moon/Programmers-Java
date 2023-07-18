import java.util.*;

class Solution {
    public List solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i : arr){ list.add(i); }
        for(int i : arr){
            for(int j : delete_list){
                if(i == j){
                    list.remove(Integer.valueOf(i));
                }
            }
        }
        return list;
    }
}