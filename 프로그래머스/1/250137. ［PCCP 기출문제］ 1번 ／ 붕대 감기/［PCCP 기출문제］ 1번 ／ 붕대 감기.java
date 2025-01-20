class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int successTime = 0;
        int maxHealth = health;
        int totalTime = 0;
        int lastTime = attacks[attacks.length - 1][0];
        int idx = 0;
        
        int t = bandage[0];
        int x = bandage[1];
        int y = bandage[2];
        
        while(totalTime <= lastTime){
            successTime++;
            if(totalTime == attacks[idx][0]){
                health -= attacks[idx][1];
                successTime = 0;
                System.out.println("어택 후 health = "+ health);
                System.out.println("어택 후 totalCnt = "+ totalTime);
                if(health <= 0){ 
                    return -1;
                }
                if(idx < attacks.length-1){
                    idx++;
                }
                totalTime++;
                continue;
            }
            
            if(successTime == t){
                if(health + y + x < maxHealth){
                    health += y + x;
                }
                else{
                    health += maxHealth - health;
                }
                successTime = 0;
                totalTime++;
                continue;
            }
            
            if(health < maxHealth){
                if(health + x < maxHealth){
                    health += x;
                }
                else{
                    health += maxHealth - health;
                }
            }
            System.out.println("totalTime = "+ totalTime);
            System.out.println("successTime = "+ successTime);
            System.out.println("health = "+ health);
            totalTime++;
        }
        return health;
    }
}