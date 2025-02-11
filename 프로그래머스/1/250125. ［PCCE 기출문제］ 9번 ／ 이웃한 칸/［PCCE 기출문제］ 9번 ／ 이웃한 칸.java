class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String color = board[h][w];
        int length = board.length - 1;
        
        if(h > 0){
            if(board[h - 1][w].equals(color)){
                answer++;
            }
        }
        if(h < length){
            if(board[h + 1][w].equals(color)){
                answer++;
            }
        }
        if(w > 0){
            if(board[h][w - 1].equals(color)){
            answer++;
            }
        }
        if(w < length){
            if(board[h][w + 1].equals(color)){
                answer++;
            }
        }
        return answer;
    }
}