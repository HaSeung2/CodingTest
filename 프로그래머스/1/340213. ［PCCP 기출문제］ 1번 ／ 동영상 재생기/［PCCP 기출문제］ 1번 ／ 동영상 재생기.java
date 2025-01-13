import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String command;
        LocalTime videoLen = LocalTime.parse("00:"+video_len, DateTimeFormatter.ofPattern("HH:mm:ss"));
        LocalTime posTime = LocalTime.parse("00:"+pos, DateTimeFormatter.ofPattern("HH:mm:ss"));
        LocalTime opStartTime = LocalTime.parse("00:"+op_start, DateTimeFormatter.ofPattern("HH:mm:ss"));
        LocalTime opEndTime = LocalTime.parse("00:"+op_end, DateTimeFormatter.ofPattern("HH:mm:ss"));
        LocalTime zero = LocalTime.parse("00:00:00", DateTimeFormatter.ofPattern("HH:mm:ss"));

        for(int i = 0; i < commands.length; i++){
            command = commands[i];
            if((posTime.isAfter(opStartTime) && posTime.isBefore(opEndTime)) || posTime.equals(opStartTime)){
                posTime = opEndTime;
            }
            switch (command){
                case "prev" :
                    if(posTime.getSecond() < 10 && posTime.getMinute() == 0){
                        posTime = zero;
                        break;
                    }
                    posTime = posTime.minusSeconds(10);
                    break;
                case "next" :
                    if(posTime.plusSeconds(10).isAfter(videoLen)){
                        posTime = videoLen;
                        break;
                    }
                    posTime = posTime.plusSeconds(10);
                    break;
            }
        }
        if((posTime.isAfter(opStartTime) && posTime.isBefore(opEndTime)) || posTime.equals(opStartTime)){
                posTime = opEndTime;
            }
        String answer = posTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        return answer.substring(3);
    }
}