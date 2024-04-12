package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyMergeLead extends BaseClass{
	public MyMergeLead(ChromeDriver driver) {
		this.driver=driver;
	}

	public FromLead clickMergeLead() {
		driver.findElement(By.linkText("Merge Leads")).click();
		return new FromLead(driver);
	}

}
