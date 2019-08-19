package week5.day1;

import org.testng.annotations.Test;

import annotations.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethods {
	@Test
	public void runCreateLead() {
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead1").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Gopi");
		driver.findElementById("createLeadForm_lastName").sendKeys("J");
		driver.findElementByName("submitButton").click();
		
	}
}
