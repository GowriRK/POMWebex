package challenges;

import org.openqa.selenium.chrome.ChromeDriver;

public class Load {

	//DOM fully loaded
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://developer.mozilla.org/en-US/docs/Web/API/Document/readyState");
		String status = driver.executeScript("return document.readyState").toString();
		System.out.println(status);
	}

}