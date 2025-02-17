import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        
        while(i < arr.length){
            if(list.isEmpty()){
                list.add(arr[i]);
                i++;
                continue;
            }
            int idx = list.size() - 1;
            if(list.get(idx) < arr[i]){
                list.add(arr[i]);
                i++;
                continue;
            }
            if(list.get(idx) >= arr[i]){
                list.remove(list.get(idx));
            }
        }
        int[] stk = new int[list.size()];
        
        for(int j = 0; j < list.size(); j++){
            stk[j] = list.get(j);
        }
        return stk;
    }
}