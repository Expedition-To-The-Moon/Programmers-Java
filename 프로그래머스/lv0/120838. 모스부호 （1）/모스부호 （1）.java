class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.",
        "--.","....","..",".---","-.-",".-..","--","-.",
        "---",".--.","--.-",".-.","...","-","..-","...-",
        ".--","-..-","-.--","--.."};
        String[] morseWord = letter.split(" ");

        StringBuilder sb = new StringBuilder();

        for (String word : morseWord) {
            for (int i = 0; i < morse.length; i++) {
                if (word.equals(morse[i])) {
                    sb.append(Character.toString(i + 'a'));
                }
            }
        }
        String result = sb.toString();
        return result;
    }
}