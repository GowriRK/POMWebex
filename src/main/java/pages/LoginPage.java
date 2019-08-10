package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import libraries.Annotations;

public class LoginPage extends Annotations {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	String date = "12";
	@CacheLookup
	@FindBy(how = How.ID, using = "username")
	private WebElement eleuserName;

	@FindBy(how = How.ID, using = "password")
	private WebElement elePassword;

	@FindBy(how = How.CLASS_NAME, using = "decorativeSubmit")
	private WebElement eleLoginButton;

	@Given("enter user name {string}")
	public LoginPage enterUserName(String userName) {
//		driver.findElement(By.id("username")).sendKeys(userName);
		eleuserName.sendKeys(userName);
		return this;
	}

	@And("enter password {string}")
	public LoginPage enterPassword(String pwd) {
//		driver.findElement(By.id("password")).sendKeys(pwd);
		elePassword.sendKeys(pwd);
		return this;
	}

	@When("click login")
	public HomePage clickLoginButton() {
//		driver.findElement(By.className("decorativeSubmit")).click();
		eleLoginButton.click();
		return new HomePage();
	}

}
