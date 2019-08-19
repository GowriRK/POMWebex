package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Launch chrome using the constructor
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
		driver.findElementByXPath("//button[text()='Alert Box']").click();
		Thread.sleep(1000);
		/*Alert alert = driver.switchTo().alert();
		alert.accept();*/
		
		driver.findElementByXPath("//button[text()='Prompt Box']").click();
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("Hari");
		Thread.sleep(2000);
		alert2.accept();
		
		
		

	}

}
