package week8.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RetryCode {
	
	@Test
	public void sample() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.get("http://testleaf.herokuapp.com/pages/Window.html");
		
		driver.findElementById("home1").click();
		/*
		Set<String> allWin = driver.getWindowHandles();
		//Way 1
		List<String> allHand = new ArrayList<String>(allWin);		
		String secondWin = allHand.get(1);
		driver.switchTo().window(secondWin);
		System.out.println(driver.getTitle());
		
		//Way 2
		Iterator<String> iterator = allWin.iterator();
		String firstWin = iterator.next();
		String secondWin = iterator.next();
		driver.switchTo().window(secondWin);
		System.out.println(driver.getTitle());
		
		//way 3
		for (String eachWin : allWin) {
			driver.switchTo().window(eachWin);			
		}
		System.out.println(driver.getTitle());
		
		*/
		
		
		
		
		
		
		
		
		
	}

}
