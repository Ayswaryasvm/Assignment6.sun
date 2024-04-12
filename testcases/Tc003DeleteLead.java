package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;


public class Tc003DeleteLead extends BaseClass{
	@Test
	public void runDeleteLead() throws InterruptedException {
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
		.viewDisplayedLeadDel()
		.clickDelete()
		.findLeadVerify()
		.enterLeadId()
		.clickFindButton()
		.verifyLead();
		
	}

}
