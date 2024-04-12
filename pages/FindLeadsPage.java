package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class FindLeadsPage extends BaseClass{
	public FindLeadsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public FindLeadsPage clickPhone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}
	public FindLeadsPage enterPhoneNumber() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		return this;
	}
	public ViewExistingLeadsPage clickFindLeads() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return new ViewExistingLeadsPage(driver);
	}

}
