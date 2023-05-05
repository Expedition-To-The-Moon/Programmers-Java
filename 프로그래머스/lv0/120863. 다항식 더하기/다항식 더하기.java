class Solution {
    public String solution(String polynomial) {
        String answer = "x";
        if(!polynomial.equals("x")){
            String[] arr = polynomial.split("\\s\\+\\s");
            int num = 0;
            int sum = 0;

            for(int i=0; i<arr.length; i++){
                if(arr[i].matches("[0-9]+")){
                    num += Integer.parseInt(arr[i]);
                } else {
                    String s = arr[i].equals("x") ? arr[i].replaceAll("x", "1") : arr[i].replaceAll("x", "");
                    sum += Integer.parseInt(s);
                }
            }

            String strn = Integer.toString(num);
            String strs = Integer.toString(sum);

            if(!strn.equals("0") && !strs.equals("0")){
                if(strs.equals("1")){
                    strs = "";
                }
                answer = strs+"x"+" + "+strn;
            } else {
                answer = !strn.equals("0") ? strn : strs+"x";
            }
        }
        return answer;
    }
}