import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
    int answer = 0;
    StringBuilder str = new StringBuilder();

    for(int i : ingredient){
        str.append(i);
        if(str.length() > 3 && str.substring(str.length()-4,str.length()).equals("1231")){
            int idx = str.lastIndexOf("1231");
            answer++;
            str.delete(idx,idx+4);
        }
    }
    return answer;
    }
}