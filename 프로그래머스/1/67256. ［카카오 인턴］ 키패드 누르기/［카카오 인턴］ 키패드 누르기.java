import java.util.*;
class Solution {
    int right = 12;
    int left = 10;
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10;
        int right = 12;
        hand = hand.toUpperCase().substring(0,1);

        for(int number : numbers){
            switch(number){
                case 1, 4, 7 ->{
                    answer += "L";
                    left = number;
                    break;
                }
                case 3, 6, 9 ->{
                    answer += "R";
                    right = number;
                    break;
                }
                default ->{
                    if(number == 0){
                        number = 11;
                    }
                    int leftIdx = Math.abs(left-number)/3 + Math.abs(left-number)%3;
                    int rightIdx = Math.abs(right-number)/3 +  Math.abs(right-number)%3;
                    if(leftIdx > rightIdx){
                        answer += "R";
                        right = number;
                    }
                    if(leftIdx < rightIdx){
                        answer += "L";
                        left = number;
                    }
                    if(leftIdx == rightIdx){
                        answer += hand;
                        if(hand.equals("R")){
                            right = number;
                        }
                        else{
                            left = number;
                        }
                    }
                }
            }
        }
        return answer;        
    }
}