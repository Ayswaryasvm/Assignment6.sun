package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class Tc002EditLead extends BaseClass{
	@Test
	public void runEditLead() throws InterruptedException {
		new LoginPage(driver)
		.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.verifyHomePage()
		.clickCrmsfaLink()
		.clickLeadLinkEd()
		.clickfind()
		.clickPhone()
		.enterPhoneNumber()
		.clickFindLeads()
		.viewDisplayedLead()
		.clickEdit()
		.editCompanyName()
		.clickSubmit()
		.verifyEditLead();
	}

}
