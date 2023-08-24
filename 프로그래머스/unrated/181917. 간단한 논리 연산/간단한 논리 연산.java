class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean b12 = true;
        boolean b34 = true;
        if(x1==false && x2==false){ b12 = false; }
        if(x3==false && x4==false){ b34 = false; }
        if(b12!=true || b34!=true){answer = false;}
        return answer;
    }
}