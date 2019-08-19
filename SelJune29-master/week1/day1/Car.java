package week1.day1;

public class Car {
	// syntax to declare a variable
	// accessModifier dataType variableName = value
	public String brand = "ford";
	public int numOfSeats = 4;
	public boolean hasSunShed = false;
	// methodName -> driveCar
	// syntax: accessModifier returnType methodName() { }
	public void driveCar() {
		System.out.println("I am driving the car");
	}
	public String getColor() {
		System.out.println();
		return "white";
	}
	public static void main(String[] args) {
		System.out.println("this is my Car");
		// ClassName object = new ClassName();
		Car myCar = new Car();
		// object.methodName();
		myCar.driveCar();
		String color = myCar.getColor();
		System.out.println(color);
	}
















}








