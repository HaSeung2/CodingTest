class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int [][] num = new int[wallpaper.length][2];
        int seroMin = 0;
        int seroMax = 0;
        int garoMin = 0;
        int garoMax = 0;

        for(int i = 0; i < wallpaper.length; i++){
            num[i][0] = wallpaper[i].indexOf("#");
            num[i][1] = wallpaper[i].lastIndexOf("#");
        }
        
        for(int i = 0; i < num.length; i++){
            if(num[i][0] != -1){
                seroMin = i;
                garoMin = num[i][0];
                System.out.println(seroMin);
                System.out.println(garoMin);
                break;
            }
        }
        
        for(int i = 0; i < num.length; i++){
            if(num[i][0] != -1){
                garoMin = Math.min(garoMin,num[i][0]);
                seroMax = Math.max(seroMax,i);
                garoMax = Math.max(garoMax,num[i][1]);
                System.out.println(seroMax);
                System.out.println(garoMax);
            }
        }
        answer[0] = seroMin;
        answer[1] = garoMin;
        answer[2] = seroMax+1;
        answer[3] = garoMax+1;
        
        return answer;
    }
}