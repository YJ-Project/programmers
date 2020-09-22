package programmers;

import java.util.HashMap;

public class Spy {

    public int solution(String[][] clothes) {
		//String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		//String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0; i< clothes.length;i++){
			map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0)+1);
		}

		for(String c : map.keySet()){
			answer*= map.get(c)+1;
		}
		
        return answer-1;
	}

}
