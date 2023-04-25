class Solution {
    public int solution(int n, String control) {
        int result = 0;
        
        for(int i=0; i<control.length(); i++){
            String str = control.substring(i,i+1);
            if(str.equals("w")){
                n++;
            } else if(str.equals("s")){
                n--;
            } else if(str.equals("d")){
                n = n + 10;
            } else {
                n = n - 10;
            } 
        }
        return result = n;
    }
}