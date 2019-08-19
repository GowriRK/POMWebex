package interviewPre;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForDisappear {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://www.irctc.co.in");
		
		WebElement ele = driver.findElementById("loading");		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOf(ele));
		
	//	wait.until(ExpectedConditions.numberOfWindowsToBe(4));		
//		Set<String> allWins = driver.getWindowHandles();
//		System.out.println(allWins.size());
		

		
		
		
		
		
		

		
		
		
		

	}

}







