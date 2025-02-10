class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        String replaceStr = "";
        
        for(int i = 0; i < schedules.length; i++){
            boolean flag = true;
            int thisDay = startday;
            int schedule = schedules[i] + 10;
            String str = String.valueOf(schedule);
            if(Integer.parseInt(str.substring(str.length()-2, str.length()-1)) >= 6){
                int idx = str.length() == 3 ? 1 : 2;
                int first = Integer.parseInt(str.substring(0, idx)) + 1;
                replaceStr = first + "0" + str.substring(str.length()-1);
                schedule = Integer.parseInt(replaceStr);
            }
            for(int j = 0; j < timelogs[i].length; j++){
                if(schedule < timelogs[i][j]){
                    if(thisDay < 6){
                        flag = false;
                        break;
                    }
                }
                if(thisDay == 7){
                    thisDay = 1;
                    continue;
                }
                thisDay++;
            }
            if(flag){
                answer++;
            }
        }
        return answer;
    }
}