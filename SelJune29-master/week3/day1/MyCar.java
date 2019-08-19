package week3.day1;

public class MyCar {
	public static void main(String[] args) {
		BMW myCar = new BMW();
//		myCar.model = "z";
		System.out.println(myCar.model);
		//	Auto myAuto = new Auto();
		Audi audiCar = new Audi();
		audiCar.applyBrake();
		myCar.applyBrake();

	}
}
