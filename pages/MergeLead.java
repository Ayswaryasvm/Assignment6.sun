package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MergeLead extends BaseClass{
	public MergeLead(ChromeDriver driver) {
		this.driver=driver;
	}

	public AcceptAlert clickMergeButton() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		return new AcceptAlert(driver);
	}
	
}
