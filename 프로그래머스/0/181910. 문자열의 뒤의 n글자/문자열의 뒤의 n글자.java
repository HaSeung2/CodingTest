class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int length = my_string.length() - 1;
        
        for(int i = length; i > length - n; i--){
            answer += my_string.charAt(i) + "";
        }
        
        StringBuilder sb = new StringBuilder(answer);
        sb.reverse();
        answer = sb + "";
        
        return answer;
    }
}