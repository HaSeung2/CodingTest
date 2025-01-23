import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder result = new StringBuilder();
        ArrayList <Character> array = new ArrayList<>();
        int over = 0;
        int idx = 0;
        
        for(int i = 97; i < 123; i++){
            array.add((char)i);
        }

        for(int i = 0; i < skip.length(); i++){
                idx = array.indexOf(skip.charAt(i));
                array.remove(idx);
        }

         for(int j = 0; j < s.length(); j++){
            idx = (array.indexOf(s.charAt(j)))+index;
            if(idx >= array.size()){
                over = idx - array.size();
                if(over >= array.size()) over = over - array.size();
                result.append(array.get(over));
            }
            else{
                result.append(array.get(idx));
            }
        }
        return result.toString();
    }
}