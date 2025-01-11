import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) throws ParseException{
        HashMap<Character, Integer> term = new HashMap<>();
        today = today.replaceAll("[^0-9]", "");
        List<Integer> li = new ArrayList<>();

        for (int i = 0; i < terms.length; i++) {
            String sc = terms[i].replaceAll("[0-9]", "");
            char c = sc.charAt(0);
            int ci = Integer.parseInt(terms[i].replaceAll("[^0-9]", ""));
            term.put(c, ci);
        }

        for(int i = 0; i < privacies.length; i++){
            char c = privacies[i].replaceAll("[0-9]" ,"").charAt(3);
            int month = term.get(c);

            String priDate = privacies[i].replaceAll("[^0-9]", "");
            String addReturnDate = addDate(priDate,month);
            int i1 = Integer.parseInt(today) - Integer.parseInt(addReturnDate);
            if(i1 >= 0){
                li.add(i+1);
            }
        }
        int[] answer = new int[li.size()];
        for(int i = 0; i < li.size(); i++){
            answer[i] = li.get(i);
        }
        return answer;
    }
    
    private String addDate(String date,  int month) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        Calendar calendar = Calendar.getInstance();

        Date dt = dateFormat.parse(date);

        calendar.setTime(dt);

        calendar.add(Calendar.MONTH,month);

        return dateFormat.format(calendar.getTime());
    }
}