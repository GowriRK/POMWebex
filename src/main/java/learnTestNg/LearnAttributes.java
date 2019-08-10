package learnTestNg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnAttributes {
	/*
	 * @Test(groups = "smoke") public void walk() { System.out.println("walk"); }
	 * 
	 * @Test(groups = "smoke") public void run() { System.out.println("run"); }
	 */
//	@Parameters({ "url", "user" })
	@DataProvider(name = "negative")
	public void dataNeg() {

	}

	@DataProvider(name = "positive", parallel = true)
	public String[][] dataPos() throws IOException {
		return ReadExcel.read("TC001");
		/*
		 * String[][] data = new String[2][2]; data[0][0] = "koushik"; data[0][1] =
		 * "testleaf"; data[1][0] = "Chatterjee"; data[1][1] = "Google"; return data;
		 */

	}

	@Test(dataProvider = "positive")
	public void sleep(String name, String fn, String ln) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys(fn);
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

	}

}
