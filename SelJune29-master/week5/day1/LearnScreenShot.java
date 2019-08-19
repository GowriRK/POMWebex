package week5.day1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {

		// Setup the driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Launch chrome using the constructor
		ChromeDriver driver = new ChromeDriver();

		// Wait for 30 seconds
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Maximize the window
		driver.manage().window().maximize();

		// Load URL
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);

		WebElement drag = driver.findElementById("draggable");

		// Basic Drag and Drop

		Actions builder = new Actions(driver);
		builder.dragAndDropBy(drag, 100, 100).perform();

		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./snaps/snap1.png");
		FileUtils.copyFile(source, target);

	}

}
