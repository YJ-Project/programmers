package programmers.school.hash;

import java.util.HashSet;

//10시
public class Pokemon {
    public static int solution(int[] nums) {

        HashSet<Integer> pokemonData = new HashSet<>();
        for(int num : nums){
            pokemonData.add(num);
        }

        return Math.min(pokemonData.size(),nums.length / 2);
    }

    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,2};
        System.out.println("result " +solution(nums));
    }
}
