class Solution {
    public long solution(String numbers) {
        String[] sArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
       
        for(int i=0; i<sArr.length; i++){
            numbers = numbers.replaceAll(sArr[i], Integer.toString(i));
        }
        long result = Long.parseLong(numbers);
        return result;
    }
}