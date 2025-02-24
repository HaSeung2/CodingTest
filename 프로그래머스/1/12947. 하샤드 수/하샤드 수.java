class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String num = x+"";
        int len = num.length();
        int j = 0;
        for(int i = 0; i<num.length(); i++){
            char ch = num.charAt(i);
            String result = ch+"";
            j += Integer.parseInt(result);
            if(x%j == 0){
                answer = true;
            }
            else{
                answer = false;
            }
        } 
        return answer;
    }
}