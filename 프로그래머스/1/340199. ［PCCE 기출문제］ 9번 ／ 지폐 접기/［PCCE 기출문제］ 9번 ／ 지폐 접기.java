class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        boolean flag = true;
        int garo = wallet[0];
        int sero = wallet[1];
        int bgaro = bill[0];
        int bsero = bill[1];
        
        while(flag){
            if((garo >= bgaro && sero>= bsero) || garo >= bsero && sero >= bgaro){
                flag = false;
                break;
            }
            if(bgaro > bsero){
                bgaro /= 2;
                answer++;
            }
            else{
                bsero /= 2;
                answer++;
            }
        }
        
        return answer;
    }
}