package programmers.school.sort;

import java.util.Arrays;

public class HIndex {

    public static int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);

        int h = 0;
        for(int i=0; i<citations.length; i++){
            h = citations.length-i;
            if(citations[i] >= h ){
                return h;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};

    }
}
