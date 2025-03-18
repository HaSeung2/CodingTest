import java.util.regex.Pattern;
class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        String reg = ("^[0-9]*$");
        
        if(Pattern.matches(reg,s) && (s.length() == 4 || s.length() == 6)){
            return answer;
        }
        else{
            answer = false;
        }
        return answer;
    }
}