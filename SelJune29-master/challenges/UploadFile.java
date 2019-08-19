package challenges;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

public class UploadFile {
	@Test
	public void upload() throws MalformedURLException{
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		WebElement upload = driver.findElementByXPath("//input[@type='file']");
		upload.sendKeys("E:\\SoftWare\\Power_Verbs.docx");
		
		LocalFileDetector detector = new LocalFileDetector();
		((RemoteWebElement)upload).setFileDetector(detector);
		upload.sendKeys(detector
				.getLocalFile("E:\\SoftWare\\Power_Verbs.docx")
				.getAbsolutePath());
		
		
		
	}
}