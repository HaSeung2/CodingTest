class Solution {
    public int solution(String s) {
        int answer = 0;
        if(s.contains("-")){
            answer = Integer.parseInt(s)*1;
        }
        else{
            answer = Integer.parseInt(s);
        }
        return answer;
    }
}