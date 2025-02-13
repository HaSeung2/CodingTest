class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int sum = a + b + c;
        if(a != b && a != c && b != c){
            answer = sum;
        }
        if(a == b  && b != c || a != b && b == c || a == c && b != c){
            answer = sum * (a*a + b*b + c*c);
        }
        if(a == b && b == c){
            answer = sum * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
        }
        return answer;
    }
}