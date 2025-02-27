class Solution {
    public int solution(int num) {
        int answer = 0;
        
        while(true){
           if(num != 1){
               if(num % 2 != 0){           
                    num = (num*3)+1;
                    answer++;
                }
               else if(answer > 400){
                    answer = -1;
                    break;
               }
               else{
                    num = num/2;
                    answer++;
               }
            }
            else{
                break;
            }
        } 
        return answer;
    }
}