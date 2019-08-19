package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {

		// Setup the driver
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		// Launch chrome using the constructor
		ChromeDriver driver = new ChromeDriver();
		
		// Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Load URL
		driver.get("https://www.flipkart.com/");
		
		// close the pop up 
		driver.findElementByXPath("//button[text()='✕']").click();
		// Mouse over on Electronics
		WebElement electronics = driver.findElementByXPath
				("//span[text()='Electronics']");
		// Mouse Actions
		Actions builder = new Actions(driver);
		builder.moveToElement(electronics).perform();
		
	}

}





