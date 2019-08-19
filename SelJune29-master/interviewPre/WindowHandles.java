package interviewPre;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WindowHandles {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.get("http://testleaf.herokuapp.com/pages/Window.html");
		driver.findElementById("home").click();
		
		Set<String> allWins = driver.getWindowHandles();
		System.out.println(allWins.size());
		
		//Way 1:	
//		driver.switchTo().window(new ArrayList<>(driver.getWindowHandles()).get(1));
//		System.out.println(driver.getTitle());
		
		//Way 2:
//		Iterator<String> iter = allWins.iterator();
//		iter.next();
//		String secondWin = iter.next();
//		driver.switchTo().window(secondWin);
//		System.out.println(driver.getTitle());
		
		// Way 3:
		for (String eachWin : allWins) {
			driver.switchTo().window(eachWin);			
		}
		System.out.println(driver.getTitle());		
		
		String browserName = driver.getCapabilities().getBrowserName();
		System.out.println(browserName);
		Platform platform = driver.getCapabilities().getPlatform();
		System.out.println(platform);
		
		driver.quit();
		
		
		
		
		
		
		
		
//		String currentWindowRef = driver.getWindowHandle();
//		System.out.println(currentWindowRef);
		
		
		
		
		

	}

}







