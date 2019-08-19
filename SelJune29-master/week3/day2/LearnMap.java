package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {
	public static void main(String[] args) {
		Map<Integer, String> empName = 
				new HashMap<Integer, String>();
		empName.put(1001, "koushik");
		empName.put(1002, "balaji");
		empName.put(1003, "sarath");
		empName.put(1006, "gopi");
		empName.put(1001, "koushik c");
		for(Entry<Integer, String> eachEmp 
				:empName.entrySet()) {
			System.out.println(
					eachEmp.getKey() +" --> "
				+eachEmp.getValue());
		}
		
		
		/*System.out.println("values "+empName.values());
		System.out.println("keys "+empName.keySet());
		System.out.println(empName.entrySet());
		boolean containsKey = empName.containsKey(1001);
		System.out.println(containsKey);
		boolean contains = empName.containsValue("Koushik c");
		System.out.println(contains);*/
		


	}

}




