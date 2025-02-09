import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map <Character,Integer> map = new HashMap<>();
        int choice;
        int val;

        int [] score = {3,2,1,0,1,2,3};

        for(int i = 0; i < choices.length; i++){
            choice = choices[i];
            int num = 0;
            val = map.getOrDefault(survey[i].charAt(num),0);
            
            if(choice > 4){
                map.put(survey[i].charAt(num),val);
                num++;
                val = map.getOrDefault(survey[i].charAt(num),0);
                map.put(survey[i].charAt(num),val+score[choice-1]);
            }
           else if(choice < 4){
                map.put(survey[i].charAt(num),val+score[choice-1]);
                num++;
                val = map.getOrDefault(survey[i].charAt(num),0);
                map.put(survey[i].charAt(num),val);
            }    
        }

            answer += map.getOrDefault('R',0) >= map.getOrDefault('T',0) ? "R":"T";
            answer += map.getOrDefault('C',0) >= map.getOrDefault('F',0) ? "C":"F";
            answer += map.getOrDefault('J',0) >= map.getOrDefault('M',0) ? "J":"M";
            answer += map.getOrDefault('A',0) >= map.getOrDefault('N',0) ? "A":"N";

        return answer;
    }
}