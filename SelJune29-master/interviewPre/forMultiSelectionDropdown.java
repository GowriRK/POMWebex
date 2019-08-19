package interviewPre;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class forMultiSelectionDropdown {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		
		WebElement ele = driver.findElementByXPath("//div[@class='example'][6]/select");
		
		Select dd = new Select(ele);
		boolean multiple = dd.isMultiple();
		System.out.println(multiple);
		dd.selectByVisibleText("Selenium");
		dd.selectByVisibleText("UFT/QTP");	
	}
}







