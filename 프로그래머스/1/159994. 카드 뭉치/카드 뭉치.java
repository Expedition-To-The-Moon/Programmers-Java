class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String result = "Yes";
        
        int idx1 = 0;
        int idx2 = 0;
        for (int i = 0; i < goal.length; i++) {
            String g = goal[i];
            if (g.equals(cards1[idx1])) {
                if (idx1 < cards1.length - 1) {
                    idx1++;
                } else {
                    continue;
                }
            } else if (g.equals(cards2[idx2])) {
                if (idx2 < cards2.length - 1) {
                    idx2++;
                } else {
                    continue;
                }
            } else {
                result = "No";
                break;
            }
        }
        return result;
    }
}
