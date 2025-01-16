import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int num1 = 0;
        int num2 = 0;
        int idx = 0;
        List <String> cali1 = Arrays.asList(cards1);
        List <String> cali2 = Arrays.asList(cards2);
        List <String> cali3 = new ArrayList<>();

        while(true){
            if(cali3.size() < goal.length) {
                if (cali1.get(num1).equals(goal[idx])) {
                    cali3.add(cali1.get(num1));
                    if (num1 < cali1.size() - 1) {
                        num1++;
                    }
                    idx++;
                } else if (cali2.get(num2).equals(goal[idx])) {
                    cali3.add(cali2.get(num2));
                    if (num2 < cali2.size() - 1) {
                        num2++;
                    }
                    idx++;
                } else {
                    break;
                }
            }
            else{
                break;
            }
        }
        if(cali3.size() == goal.length){
            return "Yes";
        }
        else{
            return "No";
        }
    }
}