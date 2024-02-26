class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int len = photo.length;
        int[] answer = new int[len];
        
        for (int i = 0; i < len; i++) {
            int cnt = photo[i].length;
            int sum = 0;
            for (int j = 0; j < cnt; j++) {
                String s = photo[i][j];
                for (int k = 0; k < name.length; k++) {
                    if (name[k].equals(s)) {
                        sum += yearning[k];
                    }      
                }
            }
            answer[i] = sum;
        }
        return answer;
    }
}