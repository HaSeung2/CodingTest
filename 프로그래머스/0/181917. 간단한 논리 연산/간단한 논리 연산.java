class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean x12 = true;
        boolean x34 = true;
        
        if(!x1 && !x2){
            x12 = false;
        }
        if(!x3 && !x4){
            x34 = false;
        }
        if(x12 && x34){
            return answer;
        }
        answer = false;
        
        return answer;
    }
}