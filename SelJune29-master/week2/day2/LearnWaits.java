package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWaits {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// Wait for 30 seconds
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.primefaces.org/showcase/ui/misc/progressBar.xhtml");
		driver.findElement(By.xpath("(//span[text()='Start'])[2]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement progress = driver.findElementByXPath
				("//span[text()='Progress Completed']");
		wait.until(ExpectedConditions.visibilityOf(progress));
//		wait.until(ExpectedConditions.invisibilityOf(progress));
		System.out.println(progress.isDisplayed());
		
		
		
		
		
		
	}
}
