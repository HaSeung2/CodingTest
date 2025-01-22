class Solution {
    public long solution(int w, int h) {
        long answer = 0;
        
        for(int i = 0; i < w; i++){
            double n = ((double)h * i)/w;
            answer += (new Double(n)).longValue();
        }
        answer *= 2;
        return answer;
    }
}
