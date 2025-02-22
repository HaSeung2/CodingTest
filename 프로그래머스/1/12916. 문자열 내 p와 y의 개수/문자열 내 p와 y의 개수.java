class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        s = s.toUpperCase();
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'P'){
                p++;
                continue;
            }
            if(ch == 'Y'){
                y++;
                continue;
            }
        }
        
        if(p != y){
            answer = false;
        }        
        return answer;
    }
}