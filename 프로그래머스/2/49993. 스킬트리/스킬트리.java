import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        int idx = 0;
        
        
        for(String skillTress : skill_trees){
            String str = "";
            for(char ch : skillTress.toCharArray()){
                String chStr = String.valueOf(ch);
                if(skill.contains(chStr)){
                    str += chStr;
                }
            }
            if(skill.indexOf(str) == 0) answer++;
        }
        return answer;
    }
}