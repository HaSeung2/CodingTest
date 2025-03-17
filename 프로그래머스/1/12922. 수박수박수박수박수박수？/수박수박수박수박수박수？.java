class Solution {
    public String solution(int n) {
        String answer = "";
        int num = 0;
      while(num<n){
        if(num %2 == 0){
            answer += "수";
        }
          else{
              answer += "박";
          }
          num++;
      }
        return answer;
    }
}