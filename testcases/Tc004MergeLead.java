package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class Tc004MergeLead extends BaseClass{
	@Test
	public void runMergeLead() throws InterruptedException {
		new LoginPage(driver)
		.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.verifyHomePage()
		.clickCrmsfaLink()
		.clickLeadLinkMrg()
		.clickMergeLead()
		.clicFromLead()
		.switchFirstWindow()
		.selectFirstLead()
		.clickToLead()
		.switchSecondWindow()
		.selectSecondLead()
		.clickMergeButton()
		.acceptAlert()
		.verifyMerge();
		
	}
	

}
