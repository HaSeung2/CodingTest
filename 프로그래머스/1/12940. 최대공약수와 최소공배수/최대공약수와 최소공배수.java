class Solution {
 public int[] solution(int n, int m) {
        int[] answer = new int [2];

        for(int i = 1; i <= n && i <= m; i++){
            if(n % i == 0 && m % i == 0){
                int a = i;
                
                int b = (n*m)/a;
                answer [0] = a;
                answer [1] = b;
            }
        }
        return answer;
    }
}