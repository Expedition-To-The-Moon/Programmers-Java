class Solution {
    public String[] solution(String[] quiz) {
        String[] result = new String[quiz.length];
        for(int i=0; i<quiz.length; i++){
            String[] sArr = quiz[i].split(" ");
            int X = Integer.parseInt(sArr[0]);
            int Y = Integer.parseInt(sArr[2]);
            int Z = Integer.parseInt(sArr[4]);
            int Z1 = 0;

            if(sArr[1].equals("+")){
                Z1 = X+Y;    
            } else if(sArr[1].equals("-")){
                Z1 = X-Y;    
            }

            if(Z == Z1){
                result[i] = "O";
            } else {
                result[i] = "X";
            }
        }
        return result;
    }
}