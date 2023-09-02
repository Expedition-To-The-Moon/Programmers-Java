class Solution {
    public String solution(int[] numbers, String hand) {
        String res = "";
        int l = 10;
        int r = 12;
        
        for(int i : numbers){
            if( i==1 || i==4 || i==7 ){
                l = i;
                res += "L";
            } else if( i==3 || i==6 || i==9 ){
                r = i;
                res += "R";
            } else {
                if(i == 0){ i = 11; }
                if(i == l || i == r){
                    if(i == l){ res += "L"; }
                    else { res += "R"; }
                } else {
                    int nl = Math.abs(i-l);
                    int nr = Math.abs(i-r);
                    if(nl%3 == 0){ nl = nl/3;
                    } else if(nl>3){ nl = nl/3 + nl%3;
                    }
                    if(nr%3 == 0){  nr = nr/3;
                    } else if(nr>3){ nr = nr/3 + nr%3;
                    }
                    if(nl == nr){
                        if(hand.equals("right")){
                            r = i;
                            res += "R"; 
                        } else {
                            l = i;
                            res += "L"; 
                        }
                    } else if(nl > nr){
                        r = i;
                        res += "R";
                    } else {
                        l = i;
                        res += "L";
                    }
                }
            }
        }
        return res;
    }
}