import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int subm = m;
        int min = 0;
        Integer [] sc = new Integer[score.length];
        for(int i = 0; i < sc.length; i++){
            sc[i] = score[i];
        }

        Arrays.sort(sc, Collections.reverseOrder());

        for(int i = 0; i < sc.length/m; i++){
            min = sc[subm-1];
            answer+=min*m;
            subm = subm+m;
        }
        return answer;
    }
}