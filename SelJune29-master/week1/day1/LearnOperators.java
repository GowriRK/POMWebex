package week1.day1;

public class LearnOperators {


	public static void main(String[] args) {
		// LOOPS
		// sum of 1 to 10 -> 1+2+3...+10
		for (int i=1; i <= 10; i++) {
			System.out.println(i);
		}

		// CONDITION
		int age = 60;
		if(age >= 60) {
			System.out.println("senior ");
		} 
		else {
			System.out.println("not a senior");
		}

		// OPERATORS
		int a = 10, b = 10;
		System.out.println(!(a > 5));
		b = a++;
		System.out.println(++a);
		System.out.println(a);

		//		INC & DEC


		// % - remainder (modulo)
		System.out.println(a%b);
		System.out.println(a >= b);
		++a; // a = a+1;
//		a--; -> a = a - 1;
		a--;
		System.out.println(a);

	}

}







