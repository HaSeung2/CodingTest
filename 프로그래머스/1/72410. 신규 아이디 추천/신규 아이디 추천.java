class Solution {
    public String solution(String new_id) {
        String answer = "";
        new_id = new_id.toLowerCase()
            .replaceAll("[^a-z0-9-_.]", "")
            .replaceAll("\\.{2,}",".")
            .replaceAll("^\\.|\\.$", "");
        new_id = new_id.equals("") ? "a" : new_id;
        if(new_id.length() > 15){
            new_id = new_id.substring(0,15)
                .replaceAll("\\.$", "");
        }
        while(new_id.length() < 3){
            new_id += new_id.substring(new_id.length()-1);
        }
        answer = new_id;
        return answer;
    }
}
