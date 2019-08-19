package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/Window.html");
		driver.findElementById("home").click();

		// Now you will get 2 windows
		// To get the parent window handle
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		// To get all the opened window
		Set<String> handles = driver.getWindowHandles();
		for (String eachHan : handles) {
			System.out.println(eachHan);
		}
		List<String> list = new 
				ArrayList<String>(handles);
		String secondWindow = list.get(1);
		String firstWin = list.get(0);
		// How to know I got 2 windows
		System.out.println(handles.size());
		System.out.println(driver.getTitle());
		// How do I move to the second Window
		driver.switchTo().window(secondWindow);
		System.out.println(driver.getTitle());

		// How to close the second window
//		driver.close();
		
		// To close all the opened window
		driver.quit();

		// How to move back to first window
		/*driver.switchTo().window(firstWin);
		System.out.println(driver.getTitle());*/





	}

}
