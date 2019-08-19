package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableUsingXPath2 {

	public static void main(String[] args) throws InterruptedException {

		// Setup the driver
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		// Launch chrome using the constructor
		ChromeDriver driver = new ChromeDriver();
		// Wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Maximize the window
		driver.manage().window().maximize();
		driver.get("https://erail.in");
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS", Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("SBC", Keys.TAB);
		WebElement table = driver.findElementByXPath
	("//table[@class='DataTable DataTableHeader TrainList TrainListHeader']");
		int count = table.findElements(By.tagName("td")).size();
		System.out.println(count);
		WebElement table1 = driver.findElementByXPath
	("//table[@class='DataTable TrainList TrainListHeader']");
		int c = table1.findElements(By.tagName("tr")).size();
		System.out.println(c);
		WebElement lastrow = table1.findElements(By.tagName("tr")).get(c-1);
		String trainNum = lastrow.findElements(By.tagName("td")).get(0).getText();
		System.out.println(trainNum);



	}

}





