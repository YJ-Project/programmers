package programmers.school.test;

import java.util.Stack;

public class firstWeek_2 {
    public static int solution(String s) {
        Stack<Character> answer = new Stack<>();

        for(char data : s.toCharArray()){
            if(!answer.isEmpty()&&answer.peek().equals(data)){
                answer.pop();
            }else {
                answer.push(data);
            }
        }

        return answer.isEmpty()?1:0;
    }
    public static void main(String[] args) {
        String s="baabaa";
        System.out.println("result " +solution(s));
    }
}
