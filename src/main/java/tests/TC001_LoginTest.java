package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import libraries.Annotations;
import pages.LoginPage;

public class TC001_LoginTest extends Annotations {
	@BeforeTest
	public void passData() {
		excelFileName = "TC001";
	}

	@Test(dataProvider = "fetchData")
	public void login(String un, String pwd) {
		new LoginPage().enterUserName(un).enterPassword(pwd).clickLoginButton().printLoggeduser();
		/*
		 * LoginPage lp = new LoginPage(); lp.enterUserName(); lp.enterPassword();
		 * lp.clickLoginButton();
		 */

	}

}
