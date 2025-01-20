import java.util.*;
class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        int idx = 0;
        int [] arr = new int[mats.length];
        
        Arrays.sort(mats);
        
        for(int i = mats.length-1; i >= 0; i--){
            arr[idx] = mats[i];
            idx++;
        }
        
        for(int i : arr){
            for(int j=0; j <= park.length-i; j++){
                for(int k=0; k <= park[j].length-i; k++){
                    boolean flag = true;
                    
                    if(park[j][k].equals("-1")){
                        for(int z = 0; z < i; z++){
                            for(int l = 0; l < i; l++){
                                if(!park[j+z][k+l].equals("-1")){
                                    flag = false;
                                    break;
                                }
                            }
                            if(!flag){
                                break;
                            }
                        }
                        if(flag){
                            return i;
                        }
                    }
                }
            }
        }
        return answer;
    }
}