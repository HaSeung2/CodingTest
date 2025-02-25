import java.util.*;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        Map<String, Integer> friendMap = new HashMap<>();
        int[] giftCnt = new int[friends.length];
        int[][] giving = new int[friends.length][friends.length];
        
        for(int i = 0; i < friends.length; i++){
            friendMap.put(friends[i], i);
        }
        
        for(int i = 0; i < gifts.length; i++){
            String[] giftNames = gifts[i].split(" ");
            int toIdx = friendMap.get(giftNames[0]);
            int fromIdx = friendMap.get(giftNames[1]);
            
            giftCnt[toIdx]++;
            giftCnt[fromIdx]--;
            giving[toIdx][fromIdx]++;
        }

        for(int i = 0; i < giving.length; i++){
            int count = 0;
            for(int j = 0; j < giving[i].length; j++){
                //두 사람이 선물을 주고받은 기록이 있다면, 이번 달까지 두 사람 사이에 더 많은 선물을 준 사람이 다음 달에 선물을 하나 받습니다.
                // 두 사람이 선물을 주고받은 기록이 하나도 없거나 주고받은 수가 같다면, 선물 지수가 더 큰 사람이 선물 지수가 더 작은 사람에게 선물을 하나 받습니다.
                if(i != j){
                    if(giving[i][j] > giving[j][i] ||
                        giving[i][j] == giving[j][i] && giftCnt[i] > giftCnt[j]){
                        count++;
                    }
                }
            }
            if(answer < count){
                answer = count;
            }
        }
        return answer;
    }
}