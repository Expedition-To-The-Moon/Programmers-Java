import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        int l = strings.length;
        String[] res = new String[l];
        
        String[] alp = new String[l];
        for(int i=0; i<l; i++){
            String s = strings[i].substring(n, n+1);
            alp[i] = s;
        }
        Arrays.sort(alp);
        Arrays.sort(strings);
        
        for(int i=0; i<l; i++){
            for(int j=0; j<l; j++){
                String s = !strings[j].equals(".") ? strings[j].substring(n, n+1) : ".";
                if(alp[i].equals(s)){
                    res[i] = strings[j];
                    strings[j] = ".";
                    break;
                }
            }
        }
        return res;
    }
}