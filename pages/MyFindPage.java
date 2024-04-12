package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyFindPage extends BaseClass{
	public MyFindPage(ChromeDriver driver) {
		this.driver=driver;
	}

	public FindLeadsPage clickfind() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadsPage(driver);
	}
}
