package programmers;

import java.util.HashMap;

public class runner {
	    public String solution(String[] participant, String[] completion) {
	        String answer = "";
			HashMap<String,Integer> map = new HashMap<String,Integer>();
			
			for(String p : participant){
				map.put(p,map.getOrDefault(p, 0)+1);
			}
			
			for(String c: completion){
				map.put(c,map.get(c)-1);
			}
			
			for(String m : map.keySet()){
				if(map.get(m) > 0){
					answer = m;
				}
			}
	        return answer;
	    }
}
