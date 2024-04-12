package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class WELcomePage extends BaseClass{
	public WELcomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	public WELcomePage verifyHomePage() {
		String text = driver.findElement(By.tagName("h2")).getText();
		if(text.contains("Welcome"))
		{
			System.out.println("HomePage displayed");
		}
		else
		{
			System.out.println("HomePage not displayed");
		}
		return this;
	}
	public MyHomePage clickCrmsfaLink() {
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	}

}
