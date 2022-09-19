package programmers.school.heap;

import java.util.PriorityQueue;

public class Scoville {
    public static int solution(int[] scoville, int K) {
        PriorityQueue<Integer> scovilleData = new PriorityQueue<>();

        //min-heap 데이터 만들기
        for(int scovilleValue : scoville){
            scovilleData.add(scovilleValue);
        }
        int mixCnt = 0;
        while (scovilleData.peek()<K){
            if(scovilleData.size()<2){
                return -1;
            }

            int curruentScoville= scovilleData.remove();
            int nextScoville=scovilleData.remove();

            mixCnt++;
            scovilleData.offer(curruentScoville+(nextScoville*2));
        }
        return mixCnt;
    }
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;
        System.out.println("result " +solution(scoville,k));
    }
}
