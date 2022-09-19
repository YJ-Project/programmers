package programmers.school.test;
import java.util.*;

public class firstWeek_1 {
    public static String[] solution(String[] record) {
        HashMap<String, String> recordData = new HashMap<>();
        HashMap<String, String> statusKor = new HashMap<>();
        statusKor.put("Enter","들어왔습니다.");
        statusKor.put("Leave","나갔습니다.");

       for(int i=0;i< record.length; i++){
           String[] recordSplit = record[i].split(" ");
           if(!recordSplit[0].equals("Leave")){
               recordData.put(recordSplit[1], recordSplit[2]);
           }
       }

        //최종 answer 저장
       ArrayList<String> answer = new ArrayList<>();
       for(int i=0; i<record.length;i++){
           String[] recordSplit = record[i].split(" ");
           if(!recordSplit[0].equals("Change")){
               answer.add(recordData.get(recordSplit[1])+"님이 "+statusKor.get(recordSplit[0]));
           }
       }

        return answer.toArray(new String[0]);
    }
    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi","Enter uid4567 Prodo","Leave uid1234", "Enter uid1234 Prodo","Change uid4567 Ryan"};
        System.out.println("result " +solution(record));
    }
}
