package interviewPre;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.get("http://testleaf.herokuapp.com/pages/table.html");

		int size = driver.findElementsByXPath("//table//td/parent::tr").size();
		System.out.println(size);
		
		List<WebElement> allRow = driver.findElementsByXPath("//table//td/parent::tr/td[2]");

		List<Integer> ls = new ArrayList<>();
		for (WebElement eachEle : allRow) {
			//System.out.println(Integer.parseInt(eachEle.getText().replace("%", "")));
			ls.add(Integer.parseInt(eachEle.getText().replace("%", "")));
		}
		
		Integer minValue = Collections.min(ls);
		System.out.println(minValue);		
		String text = driver.findElementByXPath("//font[contains(text(),'"+minValue+"')]/preceding::td[1]").getText();
		System.out.println(text);
		
		driver.findElementById("").sendKeys("value");
		driver.executeScript("document.getElementById('').click()");
	}
}







