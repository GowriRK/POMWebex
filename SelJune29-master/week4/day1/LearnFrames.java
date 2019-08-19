package week4.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com");
		driver.findElementByLinkText("Selectable").click();
		// switch to a particular frame
		driver.switchTo().frame(0);
		driver.findElementByXPath("//li[text()='Item 1']")
		.click();
		// switch out of all the frames
		driver.switchTo().defaultContent();
		driver.findElementByLinkText("Draggable").click();



	}

}
