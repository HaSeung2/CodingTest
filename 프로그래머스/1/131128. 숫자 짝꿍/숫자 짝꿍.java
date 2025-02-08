import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();

        int [] xArr = new int[10];
        int [] yArr = new int[10];

        for(String a : X.split("")){
            xArr[a.charAt(0)- '0']++;
        }
        for(String b : Y.split("")){
            yArr[b.charAt(0) - '0']++;
        }
        
        for(int i = 9; i >= 0; i--){
            while(xArr[i]>0 && yArr[i]>0){
                xArr[i]--;
                yArr[i]--;
                
                answer.append(i);
            }
        }
        if(answer.toString().equals("")) return "-1";
        if(answer.toString().startsWith("0")) return "0";

        return answer.toString();
    }
}