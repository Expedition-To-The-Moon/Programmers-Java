class Solution {
    public int solution(String before, String after) {
        int[] Balpha = new int[26];
        int[] Aalpha = new int[26];

        int result = 1;

        for(int i=0; i <before.length(); i++){
            char bCh = before.charAt(i);
            int bInt = (int)bCh -'a';
            char aCh = after.charAt(i);
            int aInt = (int)aCh -'a';
            Balpha[bInt] ++;
            Aalpha[aInt] ++;
        }

        for(int i=0; i < 26; i++){
            if(Balpha[i] != Aalpha[i]){
                result = 0;
            }
        }
        return result;
    }
}