import java.util.*;
class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int x = 5;
        int y = 5;
        List<String> list = new ArrayList<>();
        List<String> riversList = new ArrayList<>();
        String riversString = "";
       
        for(int i = 0; i < dirs.length(); i++){
            char ch = dirs.charAt(i);
            String str = (x + "") + (y + "");
            
            switch(ch){
                case 'U' : 
                    if(x < 10){
                        x++;
                        riversString = (x +  "")  + (y + "") + " " + str;
                        str += " " + (x + "") + (y + "");
                        if(!(list.contains(str) || list.contains(riversString))){
                            answer++;
                            list.add(str);
                            list.add(riversString);
                        }
                    }
                    break;
                case 'D' :
                    if(x > 0){
                        x--;
                        riversString = (x +  "")  + (y + "") + " " + str;
                        str += " " + (x + "") + (y + "");
                       if(!(list.contains(str) || list.contains(riversString))){
                            answer++;
                            list.add(str);
                            list.add(riversString);
                        }
                    }
                    break;
                case 'R' :
                    if(y < 10){
                        y++;
                        riversString = (x +  "")  + (y + "") + " " + str;
                        str += " " + (x + "") + (y + "");
                        if(!(list.contains(str) || list.contains(riversString))){
                            answer++;
                            list.add(str);
                            list.add(riversString);
                        }
                    }
                    break;
                case 'L' :
                    if(y > 0){
                        y--;
                        riversString = (x +  "")  + (y + "") + " " + str;
                        str += " " + (x + "") + (y + "");
                        if(!(list.contains(str) || list.contains(riversString))){
                            answer++;
                            list.add(str);
                            list.add(riversString);
                        }
                    }
                    break;
                }
            }
        return answer;
    }
}