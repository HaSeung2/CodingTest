import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = l; i <=r; i++){
            String ls = i + "";
            if(ls.length() == 1){
                if(ls.equals("0") || ls.equals("5")){
                    list.add(Integer.parseInt(ls));
                }
            }
            else{
                if(ls.length() == ls.replaceAll("[^05]", "").length()){
                    list.add(Integer.parseInt(ls));
                }
            }
        }
        if(list.isEmpty()){
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer =  new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}