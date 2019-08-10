package pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import libraries.Annotations;

public class HomePage extends Annotations {
	@Then("display login name")
	public HomePage printLoggeduser() {
		String welcomeDemoSales = driver.findElement(By.tagName("h2")).getText();
		System.out.println(welcomeDemoSales);
		return this;
	}

}
