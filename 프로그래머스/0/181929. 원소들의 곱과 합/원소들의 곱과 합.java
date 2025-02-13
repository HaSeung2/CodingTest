class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int gop = 1;
        for(int num : num_list){
            sum += num;
            gop *= num;
        }
        
        if(sum * sum > gop) answer = 1;
        return answer;
    }
}