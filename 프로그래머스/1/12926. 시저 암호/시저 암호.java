class Solution {
    public String solution(String s, int n) {
        String answer = "";

        for(int i = 0; i < s.length(); i++){
            int num = s.charAt(i);

            if(num >= 65 && num <= 90){
                num = num + n;
                if(num > 90){
                    num -= 26;
                }
                answer += (char)num;
            }
            else if(num >= 97 && num <= 122){
                num = num + n;
                if(num > 122){
                    num -= 26;
                }
                answer += (char)num;
            }
            else{
                answer += " ";
            }
        }
        return answer;
    }
}