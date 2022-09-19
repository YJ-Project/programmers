package programmers.school.sort;

import java.util.Arrays;

public class K {

    /*
    - 자료구조/알고리즘: 정렬
    - 시간 복잡도: O(n*m)
    - 공간 복잡도: O(1)
    - 소요 시간: 30분
    */
    public static  int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){ //O(n)
            int [] commandsArray = commands[i];
            int[] cutArray = subArray(array,commandsArray[0]-1,commandsArray[1]);
            Arrays.sort(cutArray);
            answer[i]=cutArray[commandsArray[2]-1];
        }
        return answer;

}

    private static int[] subArray(int[] array, int startIndex, int endIndex){
        int[] cutArray = Arrays.copyOfRange(array, startIndex, endIndex); //O(m)
        return cutArray;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println("result " + solution(array,commands).toString());
    }
}
