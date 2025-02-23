import java.util.*;
class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int idx = 1;
        int numIdx1 = 0;
        int numIdx2 = 0;
        
        int length = n%w != 0 ? (n/w) + 1 : n/w;
        int[][] arr = new int[length][w];
        
        for(int i = 0; i < arr.length; i++){
            Arrays.fill(arr[i], 0);
        }
        
        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0){
                for(int j = 0; j < w; j++){
                    if(idx <= n){
                        arr[i][j] = idx;   
                    }
                    if(idx == num){
                        numIdx1 = i;
                        numIdx2 = j;
                    }
                    idx++;
                } 
            }
            else{
                for(int j = w - 1; j >= 0; j--){
                    if(idx <= n){
                        arr[i][j] = idx;   
                    }
                    if(idx == num){
                        numIdx1 = i;
                        numIdx2 = j;
                    }
                    idx++;
                }
            }   
            if(idx > n) break; 
        }

        for(int i = numIdx1; i < arr.length; i++){
            if(arr[i][numIdx2] != 0){
                answer++;
            }
        }
        return answer;
    }
}