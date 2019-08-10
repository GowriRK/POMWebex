package libraries;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class Annotations extends AbstractTestNGCucumberTests {

	public String excelFileName;
	public static ChromeDriver driver;

	@BeforeMethod
	public void startApp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

	@DataProvider(name = "fetchData")
	public String[][] getData() throws IOException {
		return ReadExcel.readExcelData(excelFileName);
	}

}
