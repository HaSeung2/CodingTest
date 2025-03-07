class Solution {
 public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String [] spS = s.split(" ");
        StringBuilder sb = new StringBuilder(s);
     
        for(int i = 0; i < spS.length; i++){
            for(int j = 0; j < spS[i].length(); j++){
                if(spS[i].charAt(j) == ' '){
                    answer.append(" ");
                }
                if(j % 2 == 0){
                    answer.append(Character.toUpperCase(spS[i].charAt(j)));
                }
                else{
                    answer.append(Character.toLowerCase(spS[i].charAt(j)));
                }
            }
            if(!(i == spS.length - 1)){
                answer.append(" ");
            }
        }
        int idxNum = sb.lastIndexOf(" ");
        if(idxNum == s.length() - 1){
            answer.append(" ");
        }
     if(s.length() > answer.length()){
       answer.append(" ");  
     } 
        return answer.toString();
    }
}