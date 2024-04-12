package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyHomePage extends BaseClass{
	public MyHomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	public MyLeadsPage clickLeadLink() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage(driver);
	}
	public MyFindPage clickLeadLinkEd() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyFindPage(driver);
	}
	public MyMergeLead clickLeadLinkMrg() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyMergeLead(driver);
	}


}
