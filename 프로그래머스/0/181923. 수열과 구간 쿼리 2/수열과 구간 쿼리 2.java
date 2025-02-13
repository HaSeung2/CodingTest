import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int [queries.length];
        
        Arrays.fill(answer, 0);
        
        for(int i = 0; i < queries.length; i++){
            boolean flag = false;
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            for(int j = s; j <= e; j++){
                if(arr[j] > k){
                    flag = true;
                    if(answer[i] != 0){
                        answer[i] = answer[i] > arr[j] ? arr[j] : answer[i];
                    }
                    else{
                        answer[i] = arr[j];
                    }
                }
            }
            if(!flag){
                answer[i] = -1;
            }
            
        }
        return answer;
    }
}