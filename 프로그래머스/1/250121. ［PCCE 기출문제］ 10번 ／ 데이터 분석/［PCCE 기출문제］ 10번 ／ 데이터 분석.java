import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        ArrayList<int[]> list = new ArrayList<>();
        int[] idxs = {0,1,2,3};
        int idx = this.getIdx(ext);

        for(int i = 0; i < data.length; i++){
            int valData = data[i][idxs[idx]];
            if(valData < val_ext){
                list.add(data[i]); 
            }
        }
        int[][] answer = new int[list.size()][list.get(0).length];
        int sortIdx = this.getIdx(sort_by);
        
        Collections.sort(list, (int[] arr1, int[] arr2) -> {
            int result = 1;
            if(arr1[sortIdx] < arr2[sortIdx]){
                result = -1;
            }
            return result;
        });
        
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.get(0).length; j++){
                answer[i][j] = list.get(i)[j];
            }
        }
        
        return answer;
    }
    
    public int getIdx(String role){
        int idx = 0;
        switch(role){
                case "code" -> {
                    idx = 0;
                }
                case "date" -> {
                    idx = 1;
                }
                case "maximum" -> {
                    idx = 2;
                }
                default ->{
                    idx = 3;
                }
        }
        return idx;
    }
}