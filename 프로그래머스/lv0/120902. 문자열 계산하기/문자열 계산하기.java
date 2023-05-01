class Solution {
    public int solution(String my_string) {
        String[] sArr = my_string.split(" ");
        int result = Integer.parseInt(sArr[0]);
        
        for(int i=1; i<sArr.length-1; i++){
            String num = sArr[i+1];
            if(sArr[i].equals("+")){
                result += Integer.parseInt(num);
            } else if(sArr[i].equals("-")){
                result -= Integer.parseInt(num);
            }
        }
        return result;
    }
}