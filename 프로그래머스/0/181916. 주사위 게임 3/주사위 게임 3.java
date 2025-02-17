import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] arr = {a, b, c, d};
        
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
                continue;
            }
            map.put(arr[i], 1);
            list.add(arr[i]);
        }
        
        if(map.size() == 4){
            answer = arr[0];
            for(int i = 0; i < 3; i++){
                answer = Math.min(answer, arr[i+1]);
            }
        }
        else if(map.size() == 3){
            if(map.get(list.get(0)) == 2){
                answer = list.get(1) * list.get(2);
            }
            else if(map.get(list.get(1)) == 2){
                answer = list.get(0) * list.get(2);
            }
            else{
                answer = list.get(0) * list.get(1);
            }
        }
        else if(map.size() == 2){
            if(map.get(list.get(0)) == 3){
                answer = (int)Math.pow(10 * list.get(0) + list.get(1), 2);
            }
            else if(map.get(list.get(1)) == 3){
                answer = (int)Math.pow(10 * list.get(1) + list.get(0), 2);
            }
            else{
                answer = (list.get(0) + list.get(1)) * Math.abs((list.get(0) - list.get(1))); 
            }
        }
        else{
           answer = 1111 * list.get(0);  
        }
 
        return answer;
    }
}