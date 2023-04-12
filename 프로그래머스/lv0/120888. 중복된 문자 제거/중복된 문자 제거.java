class Solution {
    public String solution(String my_string) {
        int len = my_string.length();

        char[] chArr = new char[len];
        
        for(int i=0; i<len; i++){
            chArr[i] = my_string.charAt(i);           
        }
        
        char[] repeat = new char[len];
        int cnt = 0;

        for(int i=0; i<len-1; i++){
            for(int j=i+1; j<len; j++){
                if(chArr[i] == chArr[j]){
                    repeat[j] = chArr[j];
                    cnt++;
                    break;
                } 
            }       
        }

        String[] strArr = new String[len-cnt];
        int index = 0;

        for(int i=0; i<len; i++){
            if(chArr[i] != repeat[i]){
                strArr[index] = Character.toString(chArr[i]) ;
                index++;
            }
        }
        
        String result = "";
        
        for(String word: strArr){
            result += word;
        }
        return result;
    }
}