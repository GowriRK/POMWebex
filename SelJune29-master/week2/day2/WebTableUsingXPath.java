package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableUsingXPath {

	public static void main(String[] args) throws InterruptedException {

		// Setup the driver
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		// Launch chrome using the constructor
		ChromeDriver driver = new ChromeDriver();
		
		// Maximize the window
		driver.manage().window().maximize();
		
		//Load URL
		driver.get("http://testleaf.herokuapp.com/pages/table.html");
		
		// Get the number of rows of the table
		WebElement table = driver.findElementByXPath("//table");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
		// Get the number of columns of the table
		int size = table.findElements(By.tagName("th")).size();
		System.out.println(size);
		// Get the progress value of 'Learn to interact with Elements'  
		String text = table.findElement(
		By.xpath("//font[contains(text(),'Locators')]/following::font[1]"))
		.getText();
		System.out.println(text);
		// Check the checkbox that has 20% completion
		table.findElement(By.xpath("//font[contains(text(),'100%')]/following::input[1]")).click();
		
		
		
		
	}

}





