package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		// Setup the driver
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		// Launch chrome using the constructor
		ChromeDriver driver = new ChromeDriver();
		
		// Wait for 30 seconds
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Maximize the window
		driver.manage().window().maximize();
		
		//Load URL
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElementById("draggable");
		
		// Basic Drag and Drop

		Actions builder = new Actions(driver);
		builder.dragAndDropBy(drag, 100, 100).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}





