import java.util.*;
class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        List<String> list = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++){
            list.add(my_string.substring(i));
        }
        
        if(list.contains(is_suffix)){
            answer = 1;
        }
        return answer;
    }
}