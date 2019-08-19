package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
public static void main(String[] args) {
//	ArrayList<String> list = new ArrayList<String>();
	List<String> list = new ArrayList<String>();
	list.add("RR");
	list.add("BMW");
	list.add("Bugati");
	list.add("Audi");
	list.add(0, "Audi");
	list.remove("BMW");
	boolean result = list.contains("RR");
	System.out.println(result);
	System.out.println("Size of the list: "+list.size());
	Collections.sort(list);
	for (String eachItem : list) {
		System.out.println(eachItem);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
