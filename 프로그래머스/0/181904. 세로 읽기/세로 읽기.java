class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int idx = 0;
        
        if(m == 1 && c == 1) {
            return my_string;
        }
        
        for(int i = 0; i < my_string.length(); i++){
            String str = my_string.substring(idx, idx + m);
            answer += str.charAt(c-1);
            idx = idx+m;
            if(idx >= my_string.length()) {
                break;
            }
        }
        return answer;
    }
}