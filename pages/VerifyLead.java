package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class VerifyLead extends BaseClass{
	public VerifyLead(ChromeDriver driver) {
		this.driver=driver;
	}
	public VerifyLead findLeadVerify() {
		driver.findElement(By.linkText("Find Leads")).click();
		return this;
	}
	public VerifyLead enterLeadId() throws InterruptedException {
		Thread.sleep(3000);
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		return this;
	}
	public VerifyLead clickFindButton() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	public VerifyLead verifyLead() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Lead deleted successfully");
		} else {
			System.out.println("Lead is not deleted ");
		}
		return this;
	}

}
