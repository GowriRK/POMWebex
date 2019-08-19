package week2.day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		List<WebElement> allLinks = driver.findElementsByTagName("aty0");
		
		int size = allLinks.size();
		
		System.out.println(size);
		/*WebElement ele = allLinks.get(4);
		ele.click();
		*/
		
		
		
		
		
		
		
	}

}





