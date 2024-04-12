package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class Tc001CreateLead extends BaseClass{
	@Test
	public void runCreateLead(){
		new LoginPage(driver)
		.enterPassword()
		.enterUsername()
		.clickLoginButton()
		.verifyHomePage()
		.clickCrmsfaLink()
		.clickLeadLink()
		.clickCreateLead()
		.enterCompanyName()
		.enterFirstName()
		.enterLastName()
		.enterPhoneNumber()
		.submitButton()
		.viewLead()
		.verifyLeadCreated();
	}

}
