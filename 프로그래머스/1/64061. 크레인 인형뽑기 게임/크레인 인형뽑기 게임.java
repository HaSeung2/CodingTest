import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int idx = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < moves.length; i++){
            int number = moves[i] - 1;
            
            int result = this.getNum(board, number);
            
            if(result != 0){
                if(!stack.isEmpty() && stack.peek() == result){
                    stack.pop();
                    answer += 2;
                    continue;
                }
                else{
                    stack.push(result); 
                }
            }
        }
        return answer;
    }
    
    public int getNum(int[][] board, int number){
        int num = 0;
        for(int i = number; i == number; i++){
            for(int j = 0; j < board.length; j++){
                if(board[j][i] != 0){
                    num = board[j][i];
                    board[j][i] = 0;
                    return num;
                }
            }
        }
        return num;
    }
}