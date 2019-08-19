package week1.day2;

public class LearnConstructor {
	String str; // instance variable or class level var
	
	public LearnConstructor() {
		str = "test";
		System.out.println("im in constructor");
	}
	public static void display() {
		System.out.println("display method ");
	}
	public static void main(String[] args) {
		LearnConstructor ls = new LearnConstructor();
		ls.display();
		new LearnConstructor();
		
		
	}

}







