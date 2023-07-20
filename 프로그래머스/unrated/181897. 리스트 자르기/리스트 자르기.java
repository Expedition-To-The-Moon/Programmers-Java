import java.util.*;

class Solution {
    public List solution(int n, int[] slicer, int[] num_list) {
        List<Integer> res = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        if(n==1){
            for(int i=0; i<=b; i++){
                res.add(num_list[i]);
            }
        } else if(n==2){
            for(int i=a; i<num_list.length; i++){
                res.add(num_list[i]);
            }
        } else if(n==3){
            for(int i=a; i<=b; i++){
                res.add(num_list[i]);
            }
        } else{
            for(int i=a; i<=b;){
                res.add(num_list[i]);
                i += c;
            }
        }
        return res;
    }
}