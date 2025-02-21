import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int sqrt = (int)Math.sqrt(n) + 1;
                
        int[] arr = new int[n + 1];
        Arrays.fill(arr, 0);
        
        arr[0] = arr[1] = 1;
        
        for(int i = 0; i < sqrt; i++){
            if(arr[i] == 0){
                for(int j = i*i; j < arr.length; j += i){
                    arr[j] = 1;
                }
            }       
        }
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                answer++;
            }
        }
        return answer;
    }
}