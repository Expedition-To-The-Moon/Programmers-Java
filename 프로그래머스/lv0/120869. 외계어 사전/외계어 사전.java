class Solution {
    public int solution(String[] spell, String[] dic) {
        int result = 2;

        int cnt = 0;
        for(int i=0; i<dic.length; i++){
            for(int j=0; j<spell.length; j++){
                if(dic[i].contains(spell[j])) cnt++;
            }
            if(cnt == spell.length) result = 1;
            cnt = 0;
        }
        return result;
    }
}