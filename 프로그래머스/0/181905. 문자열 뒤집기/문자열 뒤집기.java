class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        String str = my_string.substring(s, e+1);
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        answer = my_string.substring(0, s) + sb + my_string.substring(e+1);
        
        return answer;
    }
}