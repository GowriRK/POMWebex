package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 13;	
		int count = 0;
		for (int i = 1; i <= num ; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println(num +" is Prime number");
		}else
			System.out.println(num +" is not a Prime number");

	}

}
