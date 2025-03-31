import java.util.*;
class Solution {
 public int solution(String t, String p){
        int answer = 0;
        long num = 0;
        long len = p.length();
        long pp =Long.parseLong(p);
     
        List <String> list = new ArrayList<>();
     
        for(int i = 0; i <= t.length() - len; i++){
            list.add(t.substring(i,i+(int)len));
            num = Long.parseLong(list.get(i));
            if(num <= pp){
                answer++;
            }
        }
   
        return answer;
    }
}
