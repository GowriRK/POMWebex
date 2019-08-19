package week3.day1;

public class Car extends Vechicle{
	int a = 0;
	public void airBag() {
		int a = 10;
		System.out.println(this.a);
	}
	public static void main(String[] args) {
		Car c = new Car();
		c.a = 20;
		c.airBag();
		Car c1 = new Car();
		c1.a = 30;
		c1.airBag();
	}
	

}


