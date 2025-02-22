import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
            
        stack.push(arr[0]);
        queue.add(arr[0]);
        
        for(int i : arr){
            if(stack.peek() != i){
                stack.push(i);
                queue.add(i);
            }
        }
        int[] answer = new int[stack.size()];
        for(int i = 0; i < stack.size(); i++){
            answer[i] = queue.remove();
        }

        return answer;
    }
}