package programmers.school.hash;

import java.util.Arrays;

public class Prefix {
    public static boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        for(int i=0; i<phone_book.length-1;i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
                return false;
            }
        }
        return true;
    }
        public static void main(String[] args) {
        String[] phone_book = {"123","456","789"};
        System.out.println("result " +solution(phone_book));
   }
}
