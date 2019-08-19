package coding;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class PrintDuplicates extends BaseTestNg {

	String txt = "Sarath";
	
	@Test(priority=1)
	public void main() {
		char[] char_array =txt.toCharArray();
		Map<Character,Integer> charCounter=new HashMap<Character,Integer>();
		for (char ch : char_array) {
			if(charCounter.containsKey(ch)){
				charCounter.put(ch, charCounter.get(ch)+1);
				System.out.println("Dups3: "+charCounter.put(ch, 1));
			} 
			else{
				charCounter.put(ch, 1);
			}
		}
		System.out.println(charCounter);
	}
	
	
	
	//@Test(priority=2)
	public void usingSet() {
		char[] allChar = txt.toCharArray();
		Set<Character> set = new HashSet<Character>();
		for (int i = 0; i < allChar.length; i++) {
			boolean add = set.add(allChar[i]);
			if (!add) {
				System.out.println("Dup1: "+allChar[i]);
			}
		}
	}
	
	//@Test(priority=1)
	public void usingForLoop() {
		char[] allChar = txt.toCharArray();
		for (int i = 0; i < allChar.length; i++) {
			for (int j = i+1; j < allChar.length; j++) {
				if (allChar[i] == allChar[j]) {
					System.out.println("Dup :"+allChar[i]);
					break;
				}
			}
		}
		
    }

	
	
	
	
	
	
	
}