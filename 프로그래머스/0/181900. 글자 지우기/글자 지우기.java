import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        List<String>list = new ArrayList<>();
        
        for(int i : indices){
            list.add(i+"");
        }
        
        for(int i = 0; i < my_string.length(); i++){
                
            if(!list.contains(i+"")){
                answer += my_string.charAt(i)+"";
            }
        }
      
        return answer;
    }
}