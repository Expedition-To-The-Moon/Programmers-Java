import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String subStr = "";
        
        for(int i=0; i<a.length(); i++){
            char ch = a.charAt(i);
            String sub = "";
            if('a'<= ch && ch <='z'){ 
                sub = Character.toString(ch);
                subStr += sub.toUpperCase();
            } else { 
                sub = Character.toString(ch);
                subStr += sub.toLowerCase();
            }
        }
        System.out.print(subStr);
    }
}