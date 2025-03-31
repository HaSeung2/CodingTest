import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
          int[] answer = new int[commands.length];
        int t = 0;
        int j = 0;
        int z = 0;

        for(int i = 0; i < commands.length; i++){
            t = commands[i][0];
            j = commands[i][1];
            z = commands[i][2];
            int [] answer2 = Arrays.copyOfRange(array,t-1,j);
            Arrays.sort(answer2);
            answer[i] = answer2[z-1];
        }
         return answer;
    }
}