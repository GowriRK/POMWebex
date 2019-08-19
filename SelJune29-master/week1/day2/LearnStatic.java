package week1.day2;

public class LearnStatic {
	static int num = 10;
	int n = 10;
	public void count() {
		num++;
		n++;
System.out.println("static "+num+ "  -- non-static "+n);
	}
	public static void main(String[] args) {
		LearnStatic ls = new LearnStatic();
		ls.count();
		ls.count();
		LearnStatic ls1 = new LearnStatic();
		ls1.count();
		ls1.count();
		ls.count();
		
		
		
		
		/*test();
		LearnConstructor.display();*/
	}
	/*static {
		System.out.println("static block");
	}
	static {
		System.out.println("static block 1");
	}*/


}




