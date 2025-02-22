import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int length = nums.length/2;
        
        int dupical = (int)Arrays.stream(nums).distinct().count();
        
        if(dupical > length){
            answer = length;
        }
        else{
            answer = dupical;
        }

        return answer;
    }
}