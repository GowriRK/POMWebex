package week2.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {

	public static void main(String[] args) throws InterruptedException {

		//Launch Browser
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Load URL
		driver.navigate().to("http://leaftaps.com/opentaps");
		driver.get("http://leaftaps.com/opentaps");
		//Find User Name And Enter
		
		driver.findElementById("username")
						.sendKeys("DemoSalesManager",Keys.TAB);
		//Find Password And Enter
		driver.findElementById("password").sendKeys("crmsfa");
		//Find Login and Click
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByPartialLinkText("Create").click();
		
		
		
		
		
		
		
		
		
		
		
	//	driver.close();
		/*driver.findElementByLinkText("Create Lead").click();
		
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		
		Select dd = new Select(source);
		
		//Select By text
		//dd.selectByVisibleText("Conference");
		//dd.selectByValue("LEAD_EMPLOYEE");
		//dd.selectByIndex(12);
		List<WebElement> allOptions = dd.getOptions();
		int size = allOptions.size();
		//dd.selectByIndex(size-1);
		dd.getOptions().get(1).click();
		
		
		
		*/
		
		
		
		
		
		
		
		
		
	}

}





