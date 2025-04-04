import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        
        Map<String, Integer> map = new HashMap<>();
        map.put(words[0], 0);

        for(int i = 1; i < words.length; i++){
            String beforeStr = words[i-1];
            if(beforeStr.charAt(beforeStr.length() - 1) != words[i].charAt(0) 
               || map.containsKey(words[i]))
            {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
            map.put(words[i], i);
        }
        return answer;
    }
}