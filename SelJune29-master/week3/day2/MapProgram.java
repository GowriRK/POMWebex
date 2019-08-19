package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapProgram {

	public static void main(String[] args) {
		String com = "testleaf";
		char[] charArray = com.toCharArray();
		Map<Character, Integer> map = 
				new LinkedHashMap<Character, Integer>();
		for (char c : charArray) {
			if (map.containsKey(c)) {
				Integer integer = map.get(c)+1;
				map.put(c,integer );
			}else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}

}



