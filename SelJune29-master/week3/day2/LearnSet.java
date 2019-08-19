package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
public static void main(String[] args) {
	Set<String> cars = new TreeSet<String>();
	boolean add2 = cars.add("Audi");
	System.out.println("1st Audi"+add2);
	cars.add("RR");
	cars.add("Bugati");
	cars.add("Chevi");
	boolean add = cars.add("Audi");
	System.out.println("2nd Audi"+add);
	System.out.println(cars.size());
	for (String eachCar : cars) {
		System.out.println(eachCar);
	}
	
	List<String> list = new ArrayList<String>(cars);
	
	System.out.println("list size"+list.size());
	
	System.out.println(list.get(0));
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}







