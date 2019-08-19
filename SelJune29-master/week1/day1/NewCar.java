package week1.day1;

class NewCar {
	public static void main(String[] args) {
		Car c = new Car();
		c.driveCar();
		// To call var
		String brandName = c.brand;
		System.out.println(brandName);
		boolean hasSunShed = c.hasSunShed;
		System.out.println(hasSunShed);
	}
}






