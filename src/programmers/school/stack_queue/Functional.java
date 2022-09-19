package programmers.school.stack_queue;

import java.util.*;

public class Functional {
    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> finishDays = new LinkedList<>();
        List<Integer> deployPlan = new ArrayList<>();

        for(int i=0;i<progresses.length;i++){
            int finishedDay = canFinishWithin(progresses[i],speeds[i]);
            if(!finishDays.isEmpty() && finishDays.peek()< finishedDay){
                deployPlan.add(finishDays.size());
                finishDays.clear();
            }
            finishDays.offer(finishedDay);
        }

        deployPlan.add(finishDays.size());



        return deployPlan.stream().mapToInt(Integer::intValue).toArray();
    }
    private static int canFinishWithin(int progress, int speed){
        return (int) Math.ceil((double)(100.0 - progress) / speed);
    }

    public static void main(String[] args) {
//        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] progresses = {93, 30, 55};
//        int[] speeds = {1, 1, 1, 1, 1, 1};
        int[] speeds = {1, 30, 5};
        solution(progresses,speeds).toString();
    }
}
