package week3.day1;

public class LearnOverloading {
	// Static Polymorphism - Overloading
	// same method name with different kind or number of arguments

	public int calculateArea(int length) {
		return length * length;
	}

	public int calculateArea(int length, int breadth) {
		return length * breadth;
	}
	
	public double calculateArea(double length, double breadth) {
		return length * breadth;
	}
	
	
	
	
	
}
