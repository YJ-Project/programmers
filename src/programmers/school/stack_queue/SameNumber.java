package programmers.school.stack_queue;

import java.util.*;

public class SameNumber {
    public static int[] solution(int[] arr) {
        Stack<Integer> answer = new Stack<>();
        for(int i=0; i<arr.length;i++){
            if(answer.size() == 0){
                answer.push(arr[0]);
            }

            if(!answer.lastElement().equals(arr[i])){
                answer.push(arr[i]);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();

    }

    public static void main(String[] args) {
        int[] nums = {1,1,3,3,0,1,1};
        System.out.println("result " + solution(nums).toString());
    }
}
