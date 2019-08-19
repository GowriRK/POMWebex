package week3.day1;

public class LearnException {
	public static void main(String[] args) {
		int a =10;
		int b = 0;
		try {
		System.out.println(a/b);
		}
		catch (ArithmeticException e) {
			System.out.println("not divisible by 0");
		}finally {
			System.out.println("always run");
		}
	}
}
