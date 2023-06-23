class Solution {
    public String[] solution(String[] names) {
        int l = names.length;
        if(l%5 == 0){ l = l/5;
        } else { l = l/5 + 1; }
        
        String[] res = new String[l];
        int j=0;    
        for(int i=0; i<l; i++){
            j = i*5;
            res[i] = names[j];
        }
        return res;
    }
}