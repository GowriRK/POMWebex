package week3.day1;

public class ImplementedClass implements LeanInterface{

	public void sampleMethod() {
//		num=10; you cannot reassign a value for the variable from the interface
		System.out.println(num);
		
	}
	public static void main(String[] args) {
		ImplementedClass obj = new ImplementedClass();
		obj.sampleMethod();
	}

}




