package programmers.school.sort;

import java.util.Arrays;

public class largeNumber {
    public static String solution(int[] numbers) {
        String[] stringDatas = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.sort(stringDatas, (a, b) -> (b + a).compareTo(a + b)); //O(nlogn)

        if(stringDatas[0].startsWith("0")){//O(n)
            return "0";
        }
        return String.join("", stringDatas);
    }

    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};
        solution(numbers);
    }
}
