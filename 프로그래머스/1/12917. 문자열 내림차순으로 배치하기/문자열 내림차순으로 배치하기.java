import java.util.Arrays;
import java.util.Collections;
class Solution {
    public String solution(String s) {
        String answer = "";
        String [] strArr = new String[s.length()];

        for(int i=0; i<strArr.length; i++){
            strArr[i] = s.charAt(i)+"";
        }
        Arrays.sort(strArr, Collections.reverseOrder());

        for(int i = 0; i < strArr.length; i++){
            answer += strArr[i];
        }
        return answer;
        }
}