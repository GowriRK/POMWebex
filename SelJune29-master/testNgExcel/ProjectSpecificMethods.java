package testNgExcel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utility.ExcelUtil;

public class ProjectSpecificMethods {
	public String excelFileName;
	
	@DataProvider(name= "fetchData")
	public Object[][] setUpData() throws IOException {
		Object[][] data = ExcelUtil.
				readExcelData(excelFileName);
		return data;
	}
	
	public ChromeDriver driver;
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void login(String url,String username,String password) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(username);
		driver.findElementById("password").sendKeys(password);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}



