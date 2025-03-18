class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        String target = "Kim";
        int num = 0;
        for(int i = 0; i<seoul.length; i++){
            String ta = seoul[i];
            if(ta.equals(target)){
               num = i;
                answer = "김서방은 "+num+"에 있다";
            }
        }
        return answer;
    }
}