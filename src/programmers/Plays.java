package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Plays {
//베스트앨범
	public static void main(String[] args) {
		String[] genres={"classic","pop","classic","classic","pop"};
		String[] plays={"500","600","150","800","2500"};
		HashMap<String, Integer> genresMap = new HashMap<String, Integer>();
		HashMap<String, Integer> playMap = new HashMap<String, Integer>();
		
		for(int i=0;i<genres.length;i++){
		
			genresMap.put(genres[i], (genresMap.get(genres[i])==null)?Integer.parseInt(plays[i]):Integer.parseInt(plays[i])+genresMap.get(genres[i]));
			playMap.put(plays[i], i);
			
			
		}
		
		ArrayList<Integer> sorted = new ArrayList<Integer>();

		
/*		
		for(String g : genresMap.keySet()){
			for(int i=0; i<genres.length;i++){
				
			}
		}*/
	}

}
